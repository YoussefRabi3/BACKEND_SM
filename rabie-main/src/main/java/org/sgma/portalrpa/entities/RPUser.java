package org.sgma.portalrpa.entities;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class RPUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private boolean permited;
    @ManyToMany
    private List<RPRole> roleList=new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<PortalRequestAction> portalRequestActions=new ArrayList<>();


}
