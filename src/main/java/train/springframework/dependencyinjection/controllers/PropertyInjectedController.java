package train.springframework.dependencyinjection.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import train.springframework.dependencyinjection.services.GreetingService;


@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceimpl")
    public GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayGreetings();
    }
}
