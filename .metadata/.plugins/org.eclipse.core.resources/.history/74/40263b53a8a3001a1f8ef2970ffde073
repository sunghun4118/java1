ㅋpackage exam2;

import java.util.Scanner;

public class Student 
{
	public static void main(String[] args) 
	{
		
		boolean chck = true;
		StudentsClass2 grade = new StudentsClass2();
		Scanner scan = new Scanner(System.in);
		int num;
		while(chck) 
		{
		
		System.out.println("---------------------------------");
		System.out.println("1.성적입력  2.성적조회  3.전체성적조회  4.종료");
		System.out.println("---------------------------------");
		int num = scan.nextInt();
		switch(num) 
		{
			case 1:
				System.out.println("몇번 학생의 성적을 입력 하시겠습니까?");
				System.out.println("------------------------");
				num = scan.nextInt();
				System.out.println(num + "번 학생의 국어 성적을 입력 해 주세요");
				grade.Grade[num][0] = scan.nextInt();
				System.out.println(num + "번 학생의 국어 성적을 입력 해 주세요");
				grade.Grade[num][1] = scan.nextInt();
				System.out.println(num + "번 학생의 국어 성적을 입력 해 주세요");
				grade.Grade[num][2] = scan.nextInt();
				break;
				
			case 2:
				System.out.println("몇번 학생의 성적을 입력 하시겠습니까?");
				System.out.println("------------------------");
				num = scan.nextInt();
				
				System.out.println("이름: " + grade.name[num]);
				System.out.println("이름: " + grade.name[num]);
				
				System.out.println(num + "번 학생의 국어	영어	수학");
				System.out.println("    " + grade.Grade[num][0] + "    " + grade.Grade[num][1] + "    "+ grade.Grade[num][2]);
				System.out.println(num + "번 학생의 총점 평균은" + grade.summ(num) );
				grade.Grade[num][2] = scan.nextInt();
				break;
		}
		}
	}

}
