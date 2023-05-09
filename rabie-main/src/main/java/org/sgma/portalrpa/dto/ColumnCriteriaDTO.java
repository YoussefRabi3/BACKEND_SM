package org.sgma.portalrpa.dto;


import lombok.*;
import org.sgma.portalrpa.enumeration.ColumnType;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ColumnCriteriaDTO {
    private Long id;
    private String code;
    private boolean enabled;
    private String libelle;
    private ColumnType columnType;
    private SheetCriteriaDTO sheetCriteria;

}
