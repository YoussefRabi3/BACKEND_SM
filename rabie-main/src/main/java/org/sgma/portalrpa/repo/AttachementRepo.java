package org.sgma.portalrpa.repo;

import org.sgma.portalrpa.entities.Attachement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AttachementRepo extends JpaRepository<Attachement,Long> {

    @Query("select a.checkSum from Attachement a")
    List<String> getAllCheckSum();
}
