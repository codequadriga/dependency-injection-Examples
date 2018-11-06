package train.springframework.dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import train.springframework.dependencyinjection.controllers.ConstructorInjectedController;
import train.springframework.dependencyinjection.controllers.MyController;
import train.springframework.dependencyinjection.controllers.PropertyInjectedController;
import train.springframework.dependencyinjection.controllers.SetterInjectedController;

@SpringBootApplication
public class DependencyInjectionApplication {

    public static void main(String[] args) {
       ApplicationContext ctx= SpringApplication.run(DependencyInjectionApplication.class, args);
       // No need to initialize the Java Object
        MyController controller=(MyController)ctx.getBean("myController");
        controller.hello();
        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
    }
}
