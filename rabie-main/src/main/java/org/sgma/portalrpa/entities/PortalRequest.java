package org.sgma.portalrpa.entities;

import lombok.*;
import org.sgma.portalrpa.enumeration.OriginRequest;
import org.sgma.portalrpa.enumeration.RequestStatus;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PortalRequest
{
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private LocalDate requestDate;
    @Enumerated(EnumType.STRING)

    private OriginRequest originRequest;
    @Enumerated(EnumType.STRING)
    private RequestStatus requestStatus;
    @OneToOne
    private RpaProcess process;
    //@OneToOne
    //private RequestInitiation requestInitiation;
    //@OneToOne
    //private RequestValidation requestValidation;
    @OneToOne
    private Attachement attachement;
    @OneToMany(mappedBy = "portalRequest")
    private List<PortalRequestAction> portalRequestActions=new ArrayList<>();
}
