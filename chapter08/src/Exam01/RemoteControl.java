package Exam01;

public interface RemoteControl {
//	��� �ʵ�
	public int MAX_VOLUME = 100;
	public int MIN_VOLUME = 0;
//	�߻�޼ҵ�
	public void turnOn();
	public void turnOff();
	void setVolume(int volume);
	
//	public void setVolume(int volume);
////	����Ʈ�޼ҵ�
	default void setMute(boolean mute) {
		System.out.println("SET MUTE");
	}
			
	static void changeBatterry() {
		System.out.println("������ ��ȯ");
			
			}
}


