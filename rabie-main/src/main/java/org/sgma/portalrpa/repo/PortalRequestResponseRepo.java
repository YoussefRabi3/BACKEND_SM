package org.sgma.portalrpa.repo;

import org.sgma.portalrpa.entities.PortalRequestResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PortalRequestResponseRepo extends JpaRepository<PortalRequestResponse,Long> {
    @Query("select r from PortalRequestResponse r where r.portalRequest.id=:i")
    PortalRequestResponse getResponsebyRequest(@Param("i") Long id);
}
