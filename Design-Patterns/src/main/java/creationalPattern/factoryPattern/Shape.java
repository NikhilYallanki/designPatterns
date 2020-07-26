package creationalPattern.factoryPattern;

public class Shape {
	
	Area getShape(String shape) {
		
		if(shape.equals("Rectangle")) {
			return new Rectangle();
		}
		else if(shape.equals("Square")) {
			return new Square();
		}
			
		return null;
	}
	
}
