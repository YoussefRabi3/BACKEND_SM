package org.sgma.portalrpa.dto.req;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class InitReq {
    private MultipartFile file;
    private Long userId;
    private Long ProcessId;
}
