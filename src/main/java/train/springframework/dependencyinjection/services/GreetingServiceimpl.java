package train.springframework.dependencyinjection.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceimpl implements GreetingService {
    public static final String HELLO_GURUS="Hello Gurus !!!";

    @Override
    public String sayGreetings() {
        return HELLO_GURUS;
    }
}
