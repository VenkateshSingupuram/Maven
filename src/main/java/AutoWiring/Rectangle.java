package AutoWiring;

import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape {

	public void area(int x, int y) {
		System.out.println("Rectangle :"+(x*y));
	}

}
