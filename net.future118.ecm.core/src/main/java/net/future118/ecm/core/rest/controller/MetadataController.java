package net.future118.ecm.core.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 18.02.14
 * Time: 21:19
 */

@Controller
public class MetadataController {


    @RequestMapping(method = RequestMethod.POST, value = "/object/metadata/update")
    public void updateMetadata() {

    }


    @RequestMapping(method = RequestMethod.POST, value = "/object/metadata/store")
    public void storeMetadata() {

    }

    @RequestMapping(method = RequestMethod.POST, value = "/object/metadata/delete")
    public void deleteMetadata() {

    }
}
