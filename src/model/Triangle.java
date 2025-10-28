package model;

public class Triangle extends Shape{
	private double base;
	private double height;
	
	public Triangle(double base,double height) {
		setBase(base);
		setHeight(height);
	}
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return getBase() * getHeight() / 2;
	}

	@Override
	public String describe() {
		return String.format("Triângulo l: %.2f * %.2f / 2 = %.2f", getBase(),getHeight(), calculateArea());
	}
	
}
