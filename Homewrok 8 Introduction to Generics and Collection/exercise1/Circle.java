package exercise1;

public class Circle extends Shape {
	private double radius;

	public Circle(double d) {
		this.radius = d;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
		}

	@Override
	public String toString() {
		return "Radius: " + radius + ", Flächeninhalt: " + getArea();
	}

}
