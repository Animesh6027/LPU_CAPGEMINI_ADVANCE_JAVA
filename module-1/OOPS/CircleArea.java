/*Q3. Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
------------------------------------------------------------------------------------------*/

class Circle{
	private int radius;

	public int getRadius(){
		return radius;
	}

	public void setRadius(int radius){
		this.radius=radius;
	}

	public double calculateArea(){
		return 3.14*radius*radius;
	}

	public double calculatePerimeter(){
		return 2*3.14*radius;
	}
}

public class CircleArea{
	public static void main(String[] args) {
		Circle obj = new Circle();
		obj.setRadius(5);
		System.out.println("Area: " + obj.calculateArea);
	}
}