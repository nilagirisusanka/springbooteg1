package org.example.springbooteg1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String helloeveryone(){
        //the hello end point will return Hello everyone, Welcome to Spring Boot and Happy Learning
        return "Hello everyone, Welcome to Spring Boot and Happy Learning";
    }

    @GetMapping("/hai")
    public String hai(){
        //the hai endpoint will return have a nice day
        return "have a nice day";

    }
}
