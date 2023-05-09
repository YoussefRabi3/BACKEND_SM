package org.sgma.portalrpa.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PilotageFileDTO {
    private Long nbrFileControled;
    private Long nbrFileApprouved;
    private Long nbrFileRejected;
    private Long nbrFileFromUpload;
    private Long nbrFileFromBasket;
}
