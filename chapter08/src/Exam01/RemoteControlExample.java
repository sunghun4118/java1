package Exam01;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("일회용 전원 ON");
				
			}
			
			@Override
			public void turnOff() {
				System.out.println("일회용 전원 OFF");
				
			}
			
			@Override
			public void setVolume(int volume) {
				System.out.println("볼륨조절");
				
			}
		};
		
		rc.turnOn();
		rc.turnOff();
			
	}

}
