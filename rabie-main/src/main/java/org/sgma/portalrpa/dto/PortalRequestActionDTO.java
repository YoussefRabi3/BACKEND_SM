package org.sgma.portalrpa.dto;

import lombok.*;
import org.sgma.portalrpa.entities.RPUser;
import org.sgma.portalrpa.enumeration.PortalRequestActionType;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class PortalRequestActionDTO {
    private Long id;
    private LocalDate date;
    private PortalRequestActionType actionType;
    private String description;
    private RPUser user;
    private PortalRequestDTO portalRequest;

}
