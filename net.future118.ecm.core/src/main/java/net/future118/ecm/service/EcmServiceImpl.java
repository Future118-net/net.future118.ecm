package net.future118.ecm.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 21:16
 */

@Service
public class EcmServiceImpl implements EcmService {

    private final Queue<DeferredResult<String>> eventQueue = new ConcurrentLinkedQueue<>();
    @Override
    @Async
    @Scheduled(fixedRate = 5000)
    public void test() throws Exception{
        Thread.sleep(9000);
        for (DeferredResult<String> result : this.eventQueue) {
            result.setResult("deferred");
            this.eventQueue.remove(result);
        }
    }

    public Queue<DeferredResult<String>> getEventQueue() {
        return eventQueue;
    }
}
