package org.sgma.portalrpa.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Builder
@Data
public class PilotageRequestProcessDTO {
    private Map<String,Long> statProcessByDay;
}
