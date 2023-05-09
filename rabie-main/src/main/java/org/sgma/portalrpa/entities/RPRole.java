package org.sgma.portalrpa.entities;


import lombok.*;
import org.sgma.portalrpa.enumeration.RPRoleName;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class RPRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private RPRoleName fullName;

}
