package org.sgma.portalrpa.dto.req;

import lombok.Data;
import org.sgma.portalrpa.dto.RPUserDTO;

import java.util.ArrayList;
import java.util.List;

@Data
public class PageablePRUsers {
    List<RPUserDTO> userList=new ArrayList<>();
    private int page;
    private int size;
    private int totalPage;
    private int totalElement;
}
