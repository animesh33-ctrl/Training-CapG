package innerclass;

class Outer {

	void display() {

		int x = 10; // effectively final

		class Inner {
			void show() {
				System.out.println("Method Local Inner Class");
				System.out.println("Value of x : " + x);
			}
		}

		Inner obj = new Inner();
		obj.show();
	}
}

public class MethodLocalInnerDemo {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.display();
	}
}
