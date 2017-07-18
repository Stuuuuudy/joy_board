package com.joy.ex;

import com.joy.ex.model.Greeting;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Joy.Jeong on 2017. 6. 13..
 */
@RestController
public class WelcomeController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/")
    public String sayHello() {
        return "index";
    }

    @RequestMapping(value = "/hi/{id}")
    public String sayHi(@PathVariable String id) {
        System.out.println(id);

        return "index";
    }

    @RequestMapping(value = "/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }

}
