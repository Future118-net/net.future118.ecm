package net.future118.ecm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 18:00
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableAsync
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
