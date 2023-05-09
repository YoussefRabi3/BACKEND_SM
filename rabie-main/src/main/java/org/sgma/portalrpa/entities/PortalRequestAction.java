package org.sgma.portalrpa.entities;

import lombok.*;
import org.sgma.portalrpa.enumeration.PortalRequestActionType;

import javax.persistence.*;
import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class PortalRequestAction {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private PortalRequestActionType actionType;
    private String description;
    @ManyToOne
    private RPUser user;
    @ManyToOne
    private PortalRequest portalRequest;

}
