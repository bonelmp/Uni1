package exercise1;

public class Rectangle extends Shape{
	private double width, length;

	public Rectangle(double d, double e) {
		this.width = d;
		this.length = e;
	}

	@Override
	public double getArea() {
		return width*length;
	}

	@Override
	public String toString() {
		return "Breite: " + width + ", Länge: " + length + ", Flächeninhalt: " + getArea();
	}
	
	

}
