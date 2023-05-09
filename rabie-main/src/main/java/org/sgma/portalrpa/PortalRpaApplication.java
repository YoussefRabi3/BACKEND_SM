package org.sgma.portalrpa;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
@OpenAPIDefinition
public class PortalRpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortalRpaApplication.class, args);
    }

    @Bean
    CommandLineRunner start(/*IPortalRequestService service, RPUserRepo userRepo, RPRoleRepo roleRepo, IFileService fileService*/){
        return args -> {
            //service.traitFile(1L);
            /*RPRole rpRole=new RPRole();
            rpRole.setFullName(RPRoleName.INITIATOR);
            RPRole save = roleRepo.save(rpRole);
            RPUser user=new RPUser();
            user.setFullName("Initiator");
            user.getRoleList().add(save);
            userRepo.save(user);*/
            //service.initRequest(1L,1L);
            //service.validateRequest(1L,1L,"desc",true);
            //fileService.checkSheet(null,1L);
            //fileService.readExcelFile("Classeur1.xlsx");
            //fileService.generateExcel(1L);
        };
    }

}
