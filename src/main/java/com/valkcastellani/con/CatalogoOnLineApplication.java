package com.valkcastellani.con;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/*
 * @author Valk Castellani
 * @version 1.0
 * @date 2022-11-30
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class CatalogoOnLineApplication {

    public static void main(String[] args) {
        SpringApplication.run(CatalogoOnLineApplication.class, args);
    }
}
