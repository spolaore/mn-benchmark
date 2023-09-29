package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import static java.lang.Thread.sleep;

@Controller
public class HelloController {
    @Get
    public String hello() throws InterruptedException {
        sleep(1000);
        return "hello";
    }
}
