package com.stepup.StringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello, Spring!";
    }

    @GetMapping("/sum")
    public int sum(int a, int b)
    {
        return a + b;
    }

    @GetMapping("/helloname")
    public String helloName(@RequestParam(value = "name", defaultValue = "ABCD") String name) {
        return "My Name: " + name;
    }
}
