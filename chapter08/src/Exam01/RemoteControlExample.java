package Exam01;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("��ȸ�� ���� ON");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("��ȸ�� ���� OFF");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("��������");
				
			}
		};
		
		rc.turnOn();
		rc.turnOff();
			
	}

}
