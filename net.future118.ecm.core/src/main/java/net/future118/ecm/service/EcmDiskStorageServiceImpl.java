package net.future118.ecm.service;

import org.springframework.core.io.FileSystemResource;
import org.springframework.scheduling.annotation.Async;

import java.io.InputStream;

/**
 * @author: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 17.02.14
 * Time: 20:43
 */
public class EcmDiskStorageServiceImpl implements EcmStorageService {

    @Override
    @Async
    public void storeObject(InputStream inputStream) {

    }

    @Override
    public FileSystemResource getObject(String resourceId) {
        return null;
    }
}
