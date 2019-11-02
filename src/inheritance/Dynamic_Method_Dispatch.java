package inheritance;

class A
{
	int i = 1;
	public void display(){
		System.out.println("inside A");
	}

}


class B extends A{
	int i = 2;
	public void display(){
		System.out.println("inside B");
	}

	public void test(){
		System.out.println("inside test");
	}

}

public class Dynamic_Method_Dispatch{
	public static void main(String[] args){

		// resolved during complie time
		A a = new A();
		a.display();

		B  b = new B();
		b.display();

		System.out.println("******************************");

		// which version of methiod to be called is resloved during 
		// runtime

		// during runtime polymorphism, when we call a method, the it is the
		//oject that define which version of overridden method to be called
		A a1 = new B();
		a1.display();
		// a1.test(); // runtime exception


		// same is reverse when we call any class variable
		System.out.println(a1.i);
		// 2
		// 1

	}
}