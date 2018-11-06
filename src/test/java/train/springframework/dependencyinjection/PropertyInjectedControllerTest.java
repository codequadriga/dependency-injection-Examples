package train.springframework.dependencyinjection;

import org.junit.Before;
import org.junit.Test;
import train.springframework.dependencyinjection.controllers.PropertyInjectedController;
import train.springframework.dependencyinjection.services.GreetingServiceimpl;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @Before
    public void setUp() throws Exception{
        this.propertyInjectedController=new PropertyInjectedController();
        this.propertyInjectedController.greetingService=new GreetingServiceimpl();
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceimpl.HELLO_GURUS, propertyInjectedController.sayHello());
    }
}
