package net.future118.ecm.service;

import org.junit.Test;

import static  org.junit.Assert.*;

/**
 * @author: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 18.02.14
 * Time: 21:37
 */
public class UuidGeneratorServiceImplTest {

    UuidGeneratorService uuidGeneratorService = new UuidGeneratorServiceImpl();

    @Test
    public void generateUuid__shouldGenerateNotNullUuid() {
        String uuid = uuidGeneratorService.generateUuid();
        assertNotNull(uuid);
        uuid = uuidGeneratorService.generateUuid();
        assertNotNull(uuid);
        uuid = uuidGeneratorService.generateUuid();
        assertNotNull(uuid);
    }

    @Test
    public void generateUuid__shouldGenerateUniqueUuuid () {
        String uuid1 = uuidGeneratorService.generateUuid();
        String uuid2 = uuidGeneratorService.generateUuid();
        assertNotEquals(uuid1, uuid2);
        uuid1 = uuidGeneratorService.generateUuid();
        uuid2 = uuidGeneratorService.generateUuid();
        assertNotEquals(uuid1, uuid2);
        uuid1 = uuidGeneratorService.generateUuid();
        uuid2 = uuidGeneratorService.generateUuid();
        assertNotEquals(uuid1, uuid2);
        uuid1 = uuidGeneratorService.generateUuid();
        uuid2 = uuidGeneratorService.generateUuid();
        assertNotEquals(uuid1, uuid2);
        uuid1 = uuidGeneratorService.generateUuid();
        uuid2 = uuidGeneratorService.generateUuid();
        assertNotEquals(uuid1, uuid2);
        uuid1 = uuidGeneratorService.generateUuid();
        uuid2 = uuidGeneratorService.generateUuid();
        assertNotEquals(uuid1, uuid2);
        uuid1 = uuidGeneratorService.generateUuid();
        uuid2 = uuidGeneratorService.generateUuid();
        assertNotEquals(uuid1, uuid2);
    }

}
