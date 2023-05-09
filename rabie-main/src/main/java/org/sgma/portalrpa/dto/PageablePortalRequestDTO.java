package org.sgma.portalrpa.dto;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PageablePortalRequestDTO {
    private List<PortalRequestDTO> content=new ArrayList<>();
    private int page;
    private int size;
    private int totalPage;
    private int totalElement;
}
