package net.future118.ecm.core.rest.controller;

import net.future118.ecm.dao.EcmStorageDAO;
import net.future118.ecm.service.EcmMetadataService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class PutContentController {

    @Autowired
    private EcmStorageDAO ecmStorageDAO;

    @Autowired
    private EcmMetadataService ecmMetadataService;

    @RequestMapping(value = "/object/content/store", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.CREATED)
    public String storeContent () {
        return "";
    }

}
