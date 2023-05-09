package org.sgma.portalrpa.dto.req;

import lombok.Data;

@Data
public class SheetCriteriaReq {
    private String code;
    private boolean enabled;
    private String libelle;
    private Long processId;

}
