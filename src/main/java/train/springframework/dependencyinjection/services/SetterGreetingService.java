package train.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreetings(){
        return "Hello - I was injected by setter";
    }
}
