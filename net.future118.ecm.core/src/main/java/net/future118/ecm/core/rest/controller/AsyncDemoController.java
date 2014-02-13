package net.future118.ecm.core.rest.controller;

import net.future118.ecm.service.EcmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.DeferredResult;
import org.springframework.web.servlet.ModelAndView;

import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * User: Artur Szaturski <artur.szaturski@future118.net>
 * Project: net.future118.ecm
 * Date: 08.02.14
 * Time: 21:02
 */
@RestController
public class AsyncDemoController {

    private static ApplicationContext applicationContext;

    @Autowired
    private EcmService ecmService;


    @RequestMapping("/normal")
    public String normalCall() throws InterruptedException {
        Thread.sleep(9000);
        return "normal";
    }

    @RequestMapping("/async")
    public Callable<String> asyncCall(final Model model) {
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                Thread.sleep(9000);
                return "async";
            }
        };
    }

    @RequestMapping("/deferred")
    public DeferredResult<String> deferredCall() {
        DeferredResult<String> result = new DeferredResult<>();
        ecmService.getEventQueue().add(result);
        return result;
    }


}
