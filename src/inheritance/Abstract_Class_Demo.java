package inheritance;

abstract class Shape
{
	abstract void get_area();

	public void display(){
		System.out.println("Hiii this is adisplay method");
	}

	// abstract class can be used as normal main class
	public static void main(String [] args)
	{
		System.out.println("Hii inside the main");
	}

}

class Triangle extends Shape
{
	int height;
	int base;

	Triangle(int height, int base)
	{
		this.height = height;
		this.base = base;
	}

	void get_area()
	{
		int area = (this.height * this.base) /2;
		System.out.println("area = " + area);
	}
}

class Abstrac_Class_Demo
{
	public static void main(String [] args)
	{
		Triangle t = new Triangle(1, 2);
		t.get_area();
		t.display();
	}
}