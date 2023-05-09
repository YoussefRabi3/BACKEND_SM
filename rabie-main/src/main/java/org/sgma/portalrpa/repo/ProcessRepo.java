package org.sgma.portalrpa.repo;

import org.sgma.portalrpa.entities.RPUser;
import org.sgma.portalrpa.entities.RpaProcess;
import org.sgma.portalrpa.enumeration.PortalRequestActionType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ProcessRepo extends JpaRepository<RpaProcess,Long> {
    @Query("select p from  RpaProcess  p where p.enabled=true ")
    List<RpaProcess> findAllEnabledProcess();

   }
