package model;

import java.util.ArrayList;
import java.util.List;

public class AreaCalculator {

	private List<String> areas = new ArrayList<String>();
	
	public double calculateArea(Shape shape) {
        double area = shape.calculateArea();
        String describe = shape.describe();
        areas.add(String.format("%s = %.2f", describe, area));
        return area;
    }
	
	public List<String> getAreas() {
		return new ArrayList<String>(areas);
	}
}
