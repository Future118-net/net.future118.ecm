package net.future118.ecm.core.rest.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 13:32
 */
@RestController
public class GetContentController {

    @RequestMapping(value = "/object/content/get", method = RequestMethod.GET)
    @ResponseBody
    public String getObject() {
        return "test";
    }
}
