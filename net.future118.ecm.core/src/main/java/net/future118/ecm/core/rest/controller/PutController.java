package net.future118.ecm.core.rest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 13:32
 */
@RestController
public class PutController {

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.CREATED)
    public Callable<String> addNewObject () {
        return new Callable<String>() {

            @Override
            public String call() throws Exception {
                return "aaa";
            }
        };
    }
}
