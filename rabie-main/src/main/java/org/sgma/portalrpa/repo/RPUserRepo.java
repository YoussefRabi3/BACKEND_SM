package org.sgma.portalrpa.repo;

import org.sgma.portalrpa.entities.RPUser;
import org.sgma.portalrpa.enumeration.PortalRequestActionType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface RPUserRepo extends JpaRepository<RPUser,Long> {

    @Query("select u from RPUser u")
    Page<RPUser> getAllUser(Pageable pageable);

    @Query("SELECT  u FROM RPUser u JOIN u.portalRequestActions a " +
            "WHERE a.actionType = :actionType and a.date between :d1 and :d2 GROUP BY u.id " +
            "ORDER BY COUNT(a) DESC")
    List<RPUser> findTop10UsersByOperations(@Param("d1") LocalDate d1,
                                            @Param("d2")LocalDate d2,
                                            @Param("actionType")PortalRequestActionType actionType);
}
