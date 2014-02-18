package net.future118.ecm.service;

import net.future118.ecm.core.model.EcmObject;
import net.future118.ecm.dao.EcmMetadataDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Map;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 21:16
 */

@Service
public class EcmMetadataServiceImpl implements EcmMetadataService {

    @Autowired
    private UuidGeneratorService uuidGeneratorService;

    @Autowired
    private EcmMetadataDao ecmMetadataDao;

    @Override
    public String createObject(Map<String, String> metadataMap) {
        EcmObject ecmObject = new EcmObject();
        String uuid = uuidGeneratorService.generateUuid();
        return uuid;
    }
}
