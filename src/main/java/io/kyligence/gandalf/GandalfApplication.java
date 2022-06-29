package io.kyligence.gandalf;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class GandalfApplication {

    public static void main(String[] args) {
        SpringApplication.run(GandalfApplication.class, args);
    }

}
