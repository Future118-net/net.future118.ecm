package net.future118.ecm.service;

import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.Queue;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 21:15
 */
public interface EcmService {

    Queue<DeferredResult<String>> getEventQueue();

    void test() throws Exception;
}
