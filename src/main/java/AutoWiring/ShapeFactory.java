package AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeFactory {

	@Autowired         // AutoWiring By Type
	@Qualifier("rectangle")    // Shape shape = new Rectangle()
	Shape shape;            // -> 3 Implementation
	
//	@Autowired         // AutoWiring By Type
//	@Qualifier("triangle")    // Shape shape = new Rectangle()
//	Shape tshape;    
	
	public void printArea(int x, int y) {
		shape = new Triangle();
		shape.area(30, 50);
	}
}
