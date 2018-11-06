package train.springframework.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import train.springframework.dependencyinjection.services.GreetingService;
@Controller
public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreetings();
    }
    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService greetingService)
    {
        this.greetingService=greetingService;
    }
}
