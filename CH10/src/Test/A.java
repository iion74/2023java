package Test;

public class A {
	public class A {
		int memberA = 10;
		
		int field1 = 10;
		static int field2 = 20;
		B b = new B();
		C c = new C();
		
		void method1() {
			B b = new B();
			C c = new C();
		}
		static void method2() {}
		
		A(){
			System.out.println("A instance is generated.");
		}
		
		static class B {
			void method() {

				field2 = 40;
				method2();
			}
		}
		
		class C {
			void method() {
				field1 = 30;
				method1();
				field2 = 40;
				method2();
			
			}
		}
	}

}
