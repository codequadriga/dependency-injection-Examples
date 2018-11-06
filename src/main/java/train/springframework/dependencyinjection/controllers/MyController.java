package train.springframework.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;
import train.springframework.dependencyinjection.services.GreetingService;

@Controller
public class MyController {


    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String hello(){
        System.out.println("Hello World!");
        return greetingService.sayGreetings();
    }
}
