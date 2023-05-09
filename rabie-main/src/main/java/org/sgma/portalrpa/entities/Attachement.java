package org.sgma.portalrpa.entities;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Attachement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uuid;
    private String fileName;
    private String physicalFileName;
    private Double size;
    @Column(length = 512)
    private String jsonValue;
    private String checkSum;
    private boolean valid;
}
