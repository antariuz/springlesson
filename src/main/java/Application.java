import model.Car;
import model.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("model");

        Person person = context.getBean(Person.class);
        Car car = (Car) context.getBean("car");
        System.out.println(person.getName());
        System.out.println(car.getModel());

    }

}
