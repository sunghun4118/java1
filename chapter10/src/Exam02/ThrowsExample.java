package Exam02;

public class ThrowsExample {
	public void method1() {
		try {
			method2();
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ���� ����");
		}finally {
			System.out.println("finally ��");
		}
	}
	
	public void method2() throws ClassNotFoundException {
		Class c1 = Class.forName("java.lang.String");
		
}
}
