package org.sgma.portalrpa.dto;


import lombok.*;
import org.sgma.portalrpa.enumeration.RPRoleName;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RPRoleDTO {
    private Long id;
    @Enumerated(EnumType.STRING)
    private RPRoleName fullName;
}
