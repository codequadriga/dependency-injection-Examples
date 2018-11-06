package train.springframework.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.print("Hello World!");
        return "foo";
    }
}
