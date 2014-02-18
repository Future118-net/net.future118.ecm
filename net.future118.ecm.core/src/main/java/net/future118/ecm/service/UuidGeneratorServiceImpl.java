package net.future118.ecm.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * @author: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 18.02.14
 * Time: 21:36
 */

@Service
public class UuidGeneratorServiceImpl implements UuidGeneratorService {

    @Override
    public String generateUuid() {
        return UUID.randomUUID().toString();
    }
}
