package br.com.d.deureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DEurekaApplication.class, args);
    }

}
