package Exam04_constructor_access2;

import Exam04_constructor_access.A;

public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		a.field3 = 1;
		
		a.method1();
		a.method2();
		a.method3();
		
	}

}
