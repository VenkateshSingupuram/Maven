package SetterBasedDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ConstructorBasedDependencyInjection.Student;

public class Setter {
	public static void main(String[] args) {

		// Create the IOC Container

		// It Will through the Package an Create the Object (Spring - Beans)
		ApplicationContext context = new AnnotationConfigApplicationContext("SetterBasedDependencyInjection");

		String beans[] = context.getBeanDefinitionNames();

		for (String bean : beans) {
			System.out.println(bean);
		}

		Employee employee = (Employee) context.getBean("employee");
		System.out.println(employee);

	}
}
