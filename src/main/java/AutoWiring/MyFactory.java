package AutoWiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class MyFactory {
  
	@Autowired
	@Qualifier("rectangle")
	Shape tshape;
			
	public void printArea(int x, int y) {
		tshape.area(x, y);

		
	}
	
}
