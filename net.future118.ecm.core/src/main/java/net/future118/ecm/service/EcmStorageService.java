package net.future118.ecm.service;

import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;

/**
 * @author: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 17.02.14
 * Time: 20:43
 */
public interface EcmStorageService {

    void storeObject(InputStream inputStream);

    FileSystemResource getObject(String resourceId);
}
