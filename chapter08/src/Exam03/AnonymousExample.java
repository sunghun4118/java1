package Exam03;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.field.wake();
		anony.method1();
		anony.method2(
				new Person() {
					void study() {
						System.out.println("����");
					
					
					}

					@Override
					void wake() {
						// TODO Auto-generated method stub
						super.wake();
					}
									
				}
				);
	}

}
