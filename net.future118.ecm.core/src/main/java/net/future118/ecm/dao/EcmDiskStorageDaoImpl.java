package net.future118.ecm.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 17.02.14
 * Time: 20:45
 */
@Service
public class EcmDiskStorageDaoImpl implements EcmStorageDAO {

    @Value("${disk.storage.path}")
    String diskStoragePath;

    @Override
    public void storeFile(InputStream objectContent, String objectContentId) {
        assert (diskStoragePath != null);
        try {
            FileOutputStream os = new FileOutputStream(diskStoragePath + objectContentId);
            FileCopyUtils.copy(objectContent, os);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public FileSystemResource getObjectConntent(String objectContentId) {
        assert (diskStoragePath != null);
        return new FileSystemResource(diskStoragePath + objectContentId);
    }

    @Override
    public void deleteFile(String objectContentId) {
        assert (diskStoragePath != null);
    }

}

