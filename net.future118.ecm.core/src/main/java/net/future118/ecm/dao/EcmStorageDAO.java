package net.future118.ecm.dao;

import com.sun.corba.se.spi.orbutil.fsm.Input;
import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 21:25
 */
public interface EcmStorageDAO {

    void storeFile(InputStream file);

    FileSystemResource getFile();

    void deleteFile();
}
