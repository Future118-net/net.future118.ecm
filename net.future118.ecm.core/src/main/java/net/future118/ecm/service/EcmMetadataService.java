package net.future118.ecm.service;

import org.springframework.core.io.FileSystemResource;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.ModelAndView;

import java.io.InputStream;
import java.util.Map;
import java.util.Queue;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 21:15
 */
public interface EcmMetadataService {


    String createObject(Map<String,String> metadataMap);
}
