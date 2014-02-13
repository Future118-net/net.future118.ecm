package net.future118.ecm.web.browser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 13.02.14
 * Time: 21:58
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class BrowserApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(BrowserApplication.class, args);
    }

}
