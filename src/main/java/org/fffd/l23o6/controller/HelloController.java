package org.fffd.l23o6.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://172.29.4.153", allowCredentials = "true")
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {

        return "Hello h";
    }
}
