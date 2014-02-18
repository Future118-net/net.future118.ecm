package net.future118.ecm.core.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collections;
import java.util.List;

/**
 * @author: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 18.02.14
 * Time: 21:19
 */
@Controller
public class SearchPostController {

    @RequestMapping(method = RequestMethod.POST, value = "/object/metadata/find")
    public List<String> findObjectByMetadataValue () {

        return Collections.EMPTY_LIST;
    }

}
