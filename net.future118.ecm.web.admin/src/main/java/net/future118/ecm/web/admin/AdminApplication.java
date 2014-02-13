package net.future118.ecm.web.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 13.02.14
 * Time: 22:04
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class AdminApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(AdminApplication.class, args);
    }
}
