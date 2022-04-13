/*Bijay wagle
 * parent class that holds the attributes
 */

public class Circle {

	// attributes
	protected int radius = 1;
	// static variable
	static float pi = 3.142f;

	// constructor that takes radius as 1
	public Circle() {
		this.radius = 1;
	}

	// constructor
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	// getter and setter
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public static float getPi() {
		return pi;
	}

	public static void setPi(float pi) {
		Circle.pi = pi;
	}

	// method to calculate diameter
	public double getDiameter() {
		return this.radius * 2;
	}

//method to calculate area
	public double getArea() {
		return Circle.pi * this.radius * this.radius;
	}

	// method to calculate circumference
	public double getCircumference() {
		return 2 * Circle.pi * this.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
