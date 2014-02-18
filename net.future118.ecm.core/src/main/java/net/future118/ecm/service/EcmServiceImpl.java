package net.future118.ecm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.Map;

/**
 * @author: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 18.02.14
 * Time: 21:45
 */
@Service
public class EcmServiceImpl implements EcmService {

    @Autowired
    private EcmMetadataService ecmMetadataService;

    @Autowired
    private EcmStorageService ecmStorageService;

    @Override
    public String storeObjectWithMetadata(InputStream objectContent, Map<String, String> metadataMap) {
        String uuid = ecmMetadataService.createObject(metadataMap);
        return null;
    }
}
