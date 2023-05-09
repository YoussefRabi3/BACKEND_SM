package org.sgma.portalrpa.repo;

import org.sgma.portalrpa.dto.req.CriteriaColumnCriteriaDTO;
import org.sgma.portalrpa.entities.ColumnCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ColumnCriteriaRepo extends JpaRepository<ColumnCriteria,Long> {

    @Query("select c from ColumnCriteria c where c.enabled=true and c.sheetCriteria.id=:i")
    List<ColumnCriteria> findAllBySheetId(@Param("i") Long id);

    @Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
    @Query("select c from ColumnCriteria c " +
            "where 1=1 " +
            "AND c.sheetCriteria.id=:i " +
            "AND (:#{#criteria.code} is null or c.code like :#{#criteria.code})" +
            "AND (:#{#criteria.libelle} is null or c.libelle like :#{#criteria.libelle})")
    List<ColumnCriteria> search(@Param("criteria") CriteriaColumnCriteriaDTO criteria,@Param("i") Long id);
}
