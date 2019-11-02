package interface_demo;

interface Test1{
	default void display(){
		System.out.println("Test1");
	}

	static void get_name()
	{
		System.out.println("I m in test1");
	}
}


interface Test2{
	default void display(){
		System.out.println("Test2");
	}
}


interface Test3 extends Test1{
	default void display(){
		System.out.println("Test3");
	}
}


class Test4 implements Test1, Test3{
	void show(){
		System.out.println("Test4");
	}
}

class Interface_Demo2{
	public static void main(String[] args){
		Test4 t = new Test4();
		t.show();
		t.display();
		Test1.get_name();
	}
}

// in case in which a class implments two interface and both have a default method having same name
// and the implementing class is not overridding the method the compilation will fail

// We can also define static method in interface


