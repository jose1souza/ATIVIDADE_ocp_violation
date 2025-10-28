package model;

public class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		setRadius(radius);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double calculateArea() {
		return Math.PI * Math.pow(getRadius(), 2);
	}

	@Override
	public String describe() {
		return String.format("Círculo r: %.2f = %.2f", getRadius(), calculateArea());
	}
	
	
}