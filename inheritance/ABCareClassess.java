package inheritance;

/*A, B and C are classes
A is a super class. B is a sub class of A. C is a sub class of B.*/
	class A{
		void a() {
		System.out.println("Class A");	
		}
	}
	class B extends A{
		void b() {
		System.out.println("Class B");	
		}
	}
	class C extends B{
		void c() {
		System.out.println("Class C");	
		}
	}
	public class ABCareClassess {
	public static void main(String[] args) {
		C cz = new C();
		cz.c();
		cz.b();
		cz.a();;
	}

}
