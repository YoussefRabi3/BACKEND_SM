package org.sgma.portalrpa.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RPUserDTO {
    private Long id;
    private String fullName;
    private boolean permited;
}
