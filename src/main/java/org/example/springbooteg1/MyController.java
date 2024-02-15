package org.example.springbooteg1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/hello")
    public String helloeveryone(){
        return "hello everyone, welcome to spring boot and happy learning";
    }

    @GetMapping("/hai")
    public String hai(){
        return "have a nice day";

    }
}
