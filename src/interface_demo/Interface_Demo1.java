package interface_demo;

// Interface are class that lack any instance variable
// and its all methods are abstract


// any  variable decalred inside the interface are static and final
// all methods and variable are public in interface

// if interface is declared as public then the file name and 
// the name of the interface should be same


/*

Difference between class and inteface

Class can be instantiated Interface cannot
Class can maintain state information but interface cannot
*/
interface Shape{
	float PIE = 3.14f;
	float get_area();
	default String get_shape(){
		return "Shape";
	}
}

interface Dummy{
	default void dummy(){
		System.out.println("this is a dummy implemention");
	}
}

inteface test1 extends Dummy{
	void test2();
}


class Square implements Shape, Dummy
{
	int edge = 5;

	public float get_area()
	{
		return edge * edge;
	}

	// public String get_shape()
	// {
	// 	return "Square";
	// }
}

class Circle implements Shape, Dummy
{
	int r = 5;

	public float get_area()
	{
		return PIE * r * r;
	}

	public String get_shape()
	{
		return "Circle";
	}
}


class Interface_Demo1{
	public static void main(String[]  args){
		// Square sq = new Square();
		// System.out.println(sq.get_shape());
		// sq.dummy();

		/*Circle ci = new Circle();
		System.out.println(ci.get_shape());*/

		// run time polymorphism or dynamic method resolution
		Shape sh;
		// sh = new Circle();
		// System.out.println(sh.get_shape());

		sh = new Square();
		System.out.println(sh.get_shape());
		sh.dummy();

	}
}



