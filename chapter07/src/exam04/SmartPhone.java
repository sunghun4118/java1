package exam04;

public class SmartPhone extends Phone{
	
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}

	@Override
	public void bellOn() {
		// TODO Auto-generated method stub
		
	}

}
