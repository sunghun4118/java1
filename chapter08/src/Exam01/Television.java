package Exam01;

public class Television implements RemoteControl,Searchable{

	int volume;
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("전원 ON");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("전원 OFF");
		
	}

	@Override
	public void setMute(boolean mute) {
		// TODO Auto-generated method stub
		RemoteControl.super.setMute(mute);
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		this.volume = volume;
	}

	@Override
	public void search(String url) {
		System.out.println();
	}
	
	
	

}
