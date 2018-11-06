package train.springframework.dependencyinjection;

import org.junit.Before;
import org.junit.Test;
import train.springframework.dependencyinjection.controllers.ConstructorInjectedController;
import train.springframework.dependencyinjection.services.GreetingServiceimpl;
import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @Before
    public void setUp() throws Exception{
        this.constructorInjectedController=new ConstructorInjectedController(new GreetingServiceimpl());
    }
    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceimpl.HELLO_GURUS, constructorInjectedController.sayHello());
    }
}
