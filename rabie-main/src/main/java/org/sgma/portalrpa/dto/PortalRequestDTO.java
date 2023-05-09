package org.sgma.portalrpa.dto;

import lombok.*;
import org.sgma.portalrpa.enumeration.OriginRequest;
import org.sgma.portalrpa.enumeration.RequestStatus;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PortalRequestDTO {
    private Long id;
    private LocalDate requestDate;
    @Enumerated(EnumType.STRING)
    private OriginRequest originRequest;
    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus;
    private RpaProcessDTO process;
    private PortalRequestResponseDTO response;
    private AttachementDTO attachement;
}
