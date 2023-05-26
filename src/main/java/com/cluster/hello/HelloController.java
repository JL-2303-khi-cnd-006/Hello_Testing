package com.cluster.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/say")
    public String getHello(){
        return "hey...The Controller is runnning.";
    }
    
}
