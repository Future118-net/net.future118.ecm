package net.future118.ecm.service;

import java.io.InputStream;
import java.util.Map;

/**
 * @author: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 18.02.14
 * Time: 21:44
 */

public interface EcmService {

    String storeObjectWithMetadata(InputStream objectContent, Map<String, String> metadataMap);
}
