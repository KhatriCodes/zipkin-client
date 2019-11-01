package com.zipkin.client.zipkinclient;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class Controller {

   private static final Logger log = Logger.getLogger(Controller.class.getName());
    @RequestMapping("/call")
    public String show()
    {
log.info("inside controller class");
        return "This is from Zipkin Client";
    }
}
