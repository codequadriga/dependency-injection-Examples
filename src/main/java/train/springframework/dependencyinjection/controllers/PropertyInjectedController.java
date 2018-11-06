package train.springframework.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import train.springframework.dependencyinjection.services.GreetingServiceimpl;

@Controller
public class PropertyInjectedController {
    @Autowired
    private GreetingServiceimpl greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }
}
