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
public class SheetCriteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private boolean enabled;
    private String libelle;
    @ManyToOne
    private RpaProcess process;
    @OneToMany(mappedBy = "sheetCriteria")
    private List<ColumnCriteria> columnCriteria=new ArrayList<>();
}
