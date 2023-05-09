package org.sgma.portalrpa.dto.req;

import lombok.Data;

@Data
public class RoleToUserReq {
    private Long userId;
    private Long roleId;
}
