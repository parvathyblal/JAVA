Circle.java//file
package Graphic;
public class Circle {
	private double radius;
	public Circle(double r) {
		radius = r;
	}
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}
Rectangle.java//file
package Graphic;
public class Rectangle {
	private double length;
	private double width;
	public Rectangle(double len, double wid) {
		length = len;
		width = wid;
	}
	public double calculateArea() {
		return length * width;
	}
}
Triangle.java//file
package Graphic;
public class Triangle {
private double base;
private double height;
public Triangle(double b, double h) {
base = b;
height = h;
}
public double calculateArea() {
return 0.5 * base * height;
}
}
square.java//file
package Graphic;
public class Square {
private double side;
public Square(double s) {
side = s;
}
public double calculateArea() {
return side * side;
}
}
TestShape.java//file
import Graphic.Rectangle;
import Graphic.Triangle;
import Graphic.Square;
import Graphic.Circle;
public class TestShape {
public static void main(String[] args) {
Rectangle rectangle = new Rectangle(5, 3);
Triangle triangle = new Triangle(4, 6);
Square square = new Square(4);
Circle circle = new Circle(3);
System.out.println("Area of Rectangle: " + rectangle.calculateArea());
System.out.println("Area of Triangle: " + triangle.calculateArea());
System.out.println("Area of Square: " + square.calculateArea());
System.out.println("Area of Circle: " + circle.calculateArea());
}
}
