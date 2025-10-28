package view;

import model.AreaCalculator;
import model.Circle;
import model.Rectangle;
import model.Shape;
import model.Square;
import model.Triangle;

public class Main {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(5.0,10.0);
		Shape circle = new Circle(8.5);
		Shape square = new Square(12.0);
		Shape triangle = new Triangle(3.0,6.0);
		
		AreaCalculator calculator = new AreaCalculator();
		
		calculator.calculateArea(rectangle);
		calculator.calculateArea(circle);
		calculator.calculateArea(square);
		calculator.calculateArea(triangle);
		
		
		for (String shape : calculator.getAreas())
			System.out.println(shape);
	}
}
