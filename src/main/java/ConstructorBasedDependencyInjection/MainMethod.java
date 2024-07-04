package ConstructorBasedDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMethod {
public static void main(String[] args) {
	
	ApplicationContext context = new AnnotationConfigApplicationContext("ConstructorBasedDependencyInjection");
	
	Student student = context.getBean("student",Student.class);
	System.out.println(student);
	
	
}
}
