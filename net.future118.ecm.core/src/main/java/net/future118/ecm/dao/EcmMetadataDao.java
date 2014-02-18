package net.future118.ecm.dao;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 21:24
 */

public interface EcmMetadataDao {

    void addMetadata(String uuid,  Map.Entry<String, String> metadata);

    void updateMetadata(String uuid, Map<String, String> metadataMap);

    Map<String, String> getMetadata(String uuid);

    List<String> findByMetadata(String metadata);
}
