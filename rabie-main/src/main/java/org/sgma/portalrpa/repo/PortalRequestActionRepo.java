package org.sgma.portalrpa.repo;

import org.sgma.portalrpa.entities.PortalRequestAction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PortalRequestActionRepo extends JpaRepository<PortalRequestAction,Long> {

    Page<PortalRequestAction> findAllByUser_Id(Long id, Pageable pageable);
}
