package AutoWiring;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	public void area(int x,int y) {
		System.out.println("Triangle :"+(0.5*x*y));
	}
	
}
