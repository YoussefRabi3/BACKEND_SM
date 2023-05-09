package org.sgma.portalrpa.repo;

import org.sgma.portalrpa.entities.PortalRequest;
import org.sgma.portalrpa.enumeration.OriginRequest;
import org.sgma.portalrpa.enumeration.RequestStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PortalRequestRepo extends JpaRepository<PortalRequest,Long> {

    @Query("select pr from PortalRequest pr where pr.process.id=:i")
    Page<PortalRequest> findAllbyProcessId(@Param("i") Long processId, Pageable pageable);

    @Query("select pr from PortalRequest pr where pr.originRequest=:o and pr.requestStatus=:s")
    Page<PortalRequest> getAllRequestByOriginieAndState(@Param("o")OriginRequest originRequest, @Param("s")RequestStatus requestStatus,Pageable pageable);

    @Query("select count(p.id) from PortalRequest p " +
            "where p.requestDate between :d1 and :d2 and p.requestStatus=:s")
    Long getNumberOfRequest(@Param("d1") LocalDate d1,@Param("d2")LocalDate d2,@Param("s") RequestStatus status);

    @Query("select count(p.id) from PortalRequest p " +
            "where p.requestDate between :d1 and :d2 and p.originRequest=:o")
    Long getNumberOfRequestByOrogine(@Param("d1") LocalDate d1,
                                     @Param("d2")LocalDate d2,
                                     @Param("o") OriginRequest originRequest);

    @Query("select DATE_FORMAT(p.requestDate, '%Y-%m-%d') AS jour, count(p.id) from PortalRequest p " +
            "where p.requestDate between :d1 and :d2 and p.process.id=:pr group by jour")
    List<Object[]> getNumberOfRequestByProcess(@Param("d1") LocalDate d1,
                                     @Param("d2")LocalDate d2,
                                     @Param("pr") Long processId);

    @Query("SELECT  r FROM PortalRequest r JOIN r.process p " +
            "WHERE r.requestDate between :d1 and :d2 GROUP BY p.id " +
            "ORDER BY COUNT(p) DESC")
    List<PortalRequest> findTop10UsersByOperations(@Param("d1") LocalDate d1,
                                            @Param("d2")LocalDate d2);

}
