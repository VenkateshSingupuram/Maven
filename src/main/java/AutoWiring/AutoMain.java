package AutoWiring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {
public static void main(String[] args) {
	// Create IOC Container
	ApplicationContext context = new AnnotationConfigApplicationContext("AutoWiring");
	ShapeFactory factory = context.getBean("shapeFactory",ShapeFactory.class);
	factory.printArea(10,40);
	
	MyFactory factory1 = context.getBean("myFactory",MyFactory.class);
	factory1.printArea(10, 20);
}
}
