package inheritance;


// Object class is super class for all the classes in Java
//

class Triangle{
	int height = 4;
	int base = 3;

	public final void area(){
		int area = (this.height * this.base) / 2;
		System.out.println("area = " + area);
	}
}
/*
	If we declare any method as final we will not be able to override the method
	if we decalre class as final , that class cannot particapte in inheritance i.e
	no class can extends class that has been declared as final

	NOTE:
		when u declare any class as final its all method become final implicitly

*/

class Circle extends Triangle
{
	int radius = 5;
	float PIE = 3.14f;

	public void circle_area(){
		float area = PIE * radius * radius;
		System.out.println("circle area = " + area);
	}
	
	// public void area(){
	// 	float area = PIE * radius * radius;
	// 	System.out.println("circle area = " + area);
	// }
}

public class Final_keyWord_Demo
{
	public static void main(String args[])
	{
		Triangle t = new Triangle();
		t.area();

		t = new Circle();
		t.area();
	}
}