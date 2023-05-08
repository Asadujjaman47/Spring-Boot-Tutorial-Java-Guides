package com.springboot.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody
@RestController
public class HelloWorldController {

    // get
    // post
    // put
    // delete

    // GET HTTP Method
    // http://localhost:8090/hello-world

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}
