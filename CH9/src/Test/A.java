package Test;

public class A {
	int field1 = 10;
	static int field2 = 20;
	void method1() {}
	static void method2() {}
	
	class B{
		void method() {
			field1 = 30;
			method1();
		    field2 = 40;
		    method2 ();
		}
	}
	
	static class C {
		void method() {
			//field1 = 30;
			//method1();
		    field2 = 40;
		    method2 ();
		}
	}
	
	void method() {
		class D {
			D(){
				System.out.println("D instance is generated");
			}
		}
		D d = new D();
	}
	
	void method2() {
//		D d = new D();
	}

}
