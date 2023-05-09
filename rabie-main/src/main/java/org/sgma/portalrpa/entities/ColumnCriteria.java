package org.sgma.portalrpa.entities;


import lombok.*;
import org.sgma.portalrpa.enumeration.ColumnType;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class ColumnCriteria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private boolean enabled;
    private String libelle;
    @Enumerated(EnumType.STRING)
    private ColumnType columnType;
    @ManyToOne
    private SheetCriteria sheetCriteria;

}
