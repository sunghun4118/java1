package Exam01;

public interface RemoteControl {
//	상수 필드
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
//	추상메소드
	public void turnOn();
	public void turnOff();
	void setVolume(int volume);
	
//	public void setVolume(int volume);
////	디폴트메소드
	default void setMute(boolean mute) {
		System.out.println("SET MUTE");
	}
			
	static void changeBatterry() {
		System.out.println("건전지 교환");
			
			}
}


