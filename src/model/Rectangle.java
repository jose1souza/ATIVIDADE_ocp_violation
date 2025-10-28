package model;

public class Rectangle extends Shape{
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double calculateArea() {
		return getWidth() * getHeight();
	}
	
	 @Override
	    public String describe() {
	        return String.format("Retângulo l: %.2f a: %.2f = %.2f", getWidth(), getHeight(), calculateArea());
	    }
}
