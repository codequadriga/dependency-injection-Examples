package train.springframework.dependencyinjection;


import org.junit.Before;
import org.junit.Test;
import train.springframework.dependencyinjection.controllers.SetterInjectedController;
import train.springframework.dependencyinjection.services.GreetingServiceimpl;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {
private SetterInjectedController setterInjectedController;

@Before
    public  void setUp() throws Exception{
    this.setterInjectedController=new SetterInjectedController();
    this.setterInjectedController.setGreetingService(new GreetingServiceimpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceimpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}
