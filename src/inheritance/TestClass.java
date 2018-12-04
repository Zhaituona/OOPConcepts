package inheritance;

public class TestClass {

	public static void main(String[] args) {
	
		A a1 = new A();
		A.methodA1();
		a1.methodA();
		A.methodB1();
		A.methodC1();
		A.methodD1();
		 
		A e1 = new E();
		E e2 = new E();
		e2.methodE();
		e2.methodA();
		
		
		B a2 = new A();
		a2.methodA();
		B.methodB1();
		B.methodC1();
		B.methodD1();
		
		C c3 = new C();
		c3.methodC1();
		c3.methodD1();
		
		D c4 = new C();
		c4.methodA();
		c4.methodD1();
		D.methodD1();

	}

}
