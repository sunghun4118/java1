package Exam03;

public class Anonymous {
	Person field = new Person() {
		void work() {
			System.out.println("���");
			
		}

		@Override
		void wake() {
			System.out.println("6�� ���");
			work();
		}

	};
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("��å");
			}

			@Override
			void wake() {
				System.out.println("7�� ���");
				walk();
			}
			
		};
		localVar.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}