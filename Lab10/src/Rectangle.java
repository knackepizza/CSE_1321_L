/* 
 * Class: CSE 1321L
 * Section: 10
 * Term: Spring 2020
 * Instructor: Imad Ghandour
 * Name: Nick Nettleton
 * Lab#: 10
*/

public class Rectangle {
	double width = 1.0, height = 1.0;
	
	public Rectangle(double inputWidth, double inputHeight) {
		 width = inputWidth;
		 height = inputHeight;
	}
	
	double getArea() {
		return (width * height);
	}
	
	double getPerimeter() {
		return ((width * 2) + (height * 2));
	}
	
	double getHeight() {
		return height;
	}
	
	double getWidth() {
		return width;
	}
	
	
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(1, 1);
		Rectangle rect2 = new Rectangle(5, 6);
		
		System.out.println(rect1.getHeight());
		System.out.println(rect1.getWidth());
		System.out.println(rect1.getArea());
		System.out.println(rect1.getPerimeter() + "\n");

		System.out.println(rect2.getHeight());
		System.out.println(rect2.getWidth());
		System.out.println(rect2.getArea());
		System.out.println(rect2.getPerimeter());
	}

}
