package org.sgma.portalrpa.dto;


import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AttachementDTO {
    private Long id;
    private String uuid;
    private String fileName;
    private String physicalFileName;
    private Double size;
    private String jsonValue;
    private String checkSum;
    private boolean valid;
}
