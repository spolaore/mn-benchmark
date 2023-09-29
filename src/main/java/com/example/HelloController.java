package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;

import static java.lang.Thread.sleep;

@Controller
public class HelloController {
    @Get
    @ExecuteOn(TaskExecutors.IO)
    public String hello() throws InterruptedException {
        sleep(1000);
        return "hello";
    }
}
