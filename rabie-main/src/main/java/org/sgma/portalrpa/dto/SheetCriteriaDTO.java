package org.sgma.portalrpa.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class SheetCriteriaDTO {
    private Long id;
    private String code;
    private boolean enabled;
    private String libelle;
    private RpaProcessDTO process;
}
