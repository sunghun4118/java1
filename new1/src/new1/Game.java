package new1;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count=0;
		while(count<=4){
			
			int com = (int)(Math.random()*10+1);
			System.out.println(com);
			
			String input = scan.nextLine();
			System.out.println(input);
			char tmp;
			boolean output = true;
			
			
			for(int i = 0; i<input.length(); i++) {
				tmp = input.charAt(i);
				
				if(!('0' <= tmp && tmp <= '9')) {
					output = false; 
				}
			}
			System.out.println("숫자여부 : " +output);
			int player = Integer.parseInt(input);
			
			if(player>=1 && player <=10) {
				if(com==player) {
					System.out.println("정답");
					count=++count;
				}else {
					System.out.println("오답");
				}
			}else {
				System.out.println("오류");
			}
		}
		System.out.println(count + "몇번 맞춤");
		
	}
}
