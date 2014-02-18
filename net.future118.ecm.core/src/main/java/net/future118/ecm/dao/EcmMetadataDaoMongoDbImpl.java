package net.future118.ecm.dao;

import java.util.List;
import java.util.Map;

/**
 * @author: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 17.02.14
 * Time: 20:39
 */
public class EcmMetadataDaoMongoDbImpl implements EcmMetadataDao {

    @Override
    public void addMetadata(String uuid, Map.Entry<String, String> metadata) {

    }

    @Override
    public void updateMetadata(String uuid, Map<String, String> metadataMap) {

    }

    @Override
    public Map<String, String> getMetadata(String uuid) {
        return null;
    }

    @Override
    public List<String> findByMetadata(String metadata) {
        return null;
    }
}
