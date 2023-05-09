package org.sgma.portalrpa.repo;


import org.sgma.portalrpa.entities.SheetCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SheetCriteriaRepo extends JpaRepository<SheetCriteria,Long> {

    @Query("select s from SheetCriteria s where s.enabled=true and s.process.id=:i")
    List<SheetCriteria> findAllEnabledByProcessId(@Param("i") Long id);
}
