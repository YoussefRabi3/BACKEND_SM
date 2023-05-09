package org.sgma.portalrpa.dto.req;

import lombok.Data;

@Data
public class ValidateReq {
    private Long userId;
    private boolean valid;
    private String description;
}
