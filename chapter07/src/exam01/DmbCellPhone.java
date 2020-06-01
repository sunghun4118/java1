package exam01;

public class DmbCellPhone extends CellPhone{
	int channel;
	
	
	public DmbCellPhone() {
		super("samsung", "red");
		System.out.println("DmbCellPhone channel »ý¼º");
	}


	public DmbCellPhone(int channel) {
		this.channel = channel;
	}


	@Override
	void powerOn() {
		// TODO Auto-generated method stub
		super.powerOn();
		System.out.println("DMB!!");
	}


	@Override
	public String toString() {
		return "DmbCellPhone [channel=" + channel + "]";
	}
	
	
	
}
