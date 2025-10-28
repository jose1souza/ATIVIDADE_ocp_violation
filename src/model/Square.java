package model;

public class Square extends Shape{
	private double side;
	
	public Square(double side) {
		setSide(side);
	}
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		return getSide() * getSide();
	}

	@Override
	public String describe() {
		return String.format("Quadrado l: %.2f = %.2f", getSide(), calculateArea());
	}
	
	
}
