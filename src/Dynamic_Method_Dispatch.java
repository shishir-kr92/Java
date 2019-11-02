package inheritance;

class A
{
	public void display(){
		System.out.println("inside A");
	}
}


class B extends A{display
	public void display(){
		System.out.println('inside B');
	}

}

public class Dynamic_Method_Dispatch{
	public static void main(String[] args){

		// resolved during complie time
		A a = new A();
		a.display();

		B  b = new B();
		b.display();
	}
}