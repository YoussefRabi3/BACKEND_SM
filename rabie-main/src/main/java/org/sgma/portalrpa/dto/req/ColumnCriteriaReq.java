package org.sgma.portalrpa.dto.req;

import lombok.Data;
import org.sgma.portalrpa.enumeration.ColumnType;

@Data
public class ColumnCriteriaReq {
    private String code;
    private boolean enabled;
    private String libelle;
    private ColumnType columnType;
    private Long sheetCriteriaId;

}
