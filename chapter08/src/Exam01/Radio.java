package Exam01;

public class Radio implements RemoteControl{

	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("���� ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("���� OFF");
		
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMute(mute);
		System.out.println("radio mute");
	}
	

}
