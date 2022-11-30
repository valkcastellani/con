package com.valkcastellani.con.configuration;

import com.valkcastellani.con.mail.service.JavaMailService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * @author Valk Castellani
 * @version 1.0
 * @date 2022-11-30
 */
@Configuration
@ComponentScan(basePackageClasses = JavaMailService.class)
public class ServiceConfiguration {

}
