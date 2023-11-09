package org.fffd.l23o6.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:5173", allowCredentials = "true")
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        String s = null; // 可能导致空指针引用误报
        if (s.equals("test")) { // 可能导致空指针引用误报
            return "Hello, l23o6!";
        } else {
            return "Oops, something went wrong!";
        }
    }
}