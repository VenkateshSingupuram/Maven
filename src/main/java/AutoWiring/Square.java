package AutoWiring;


import org.springframework.stereotype.Component;

@Component       //Spring creates an Object
public class Square implements Shape {

	public void area(int x, int y) {
		System.out.println("Rectangle :"+(x*y));
	}

}

