package org.sgma.portalrpa.dto;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PortalRequestResponseDTO {
    private Long id;
    private LocalDate date;
    private String resValue;
}
