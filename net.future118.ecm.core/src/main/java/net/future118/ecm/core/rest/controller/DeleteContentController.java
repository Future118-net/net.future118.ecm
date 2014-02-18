package net.future118.ecm.core.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 14:11
 */
@RestController
public class DeleteContentController {

    @RequestMapping(value="/object/content/delete/", method = RequestMethod.DELETE)
    public void deleteObjectContent() {

    }

}
