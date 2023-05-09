package org.sgma.portalrpa.entities;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class RpaProcess {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private boolean enabled;
    private String libelle;
    @OneToMany(mappedBy = "process")
    private List<SheetCriteria> sheetCriteria=new ArrayList<>();

}
