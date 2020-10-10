package ArrayElement;

public class Circle {
	final double pi = 3.14;
	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "Red";
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.color = color;
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		double rad = this.radius;
		double area = pi * rad * rad;
		return area;
	}

}
