package new1;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		char tmp;
		boolean output = true;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�Ǻ��� ���ڿ��� �Է��ϼ��� : ");
		String input = scan.nextLine();
		
		for(int i = 0; i<input.length(); i++); {
			tmp = input.charAt(i);
			
			if(!('0' <= tmp && tmp <= '9')) {
				output = false;
			}
		}
		System.out.println("���ڿ��� : " +output);
	}

}
