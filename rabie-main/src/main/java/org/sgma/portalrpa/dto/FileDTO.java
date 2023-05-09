package org.sgma.portalrpa.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
@ToString
public class FileDTO {
    private List<Map<String, Object>> excelData = new ArrayList<>();
    private List<String> feuilles = new ArrayList<>();
}
