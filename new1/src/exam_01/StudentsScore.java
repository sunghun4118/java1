package exam_01;

import java.util.Scanner;

public class StudentsScore {
	public static void main(String[] args) {
		int sum[] = new int[10];
		int avg[] = new int[10];
		int k[] = new int [10];
		int e[] = new int [10];
		int m[] = new int [10];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i <= 9; i++) {
			System.out.println(i + 1 + "학생의 국어점수를 입력하시오");
			k[i] = scan.nextInt();
			System.out.println(i + 1 + "학생의 영어점수를 입력하시오");
			e[i] = scan.nextInt();
			System.out.println(i + 1 + "학생의 수학점수를 입력하시오");
			m[i] = scan.nextInt();
			
			sum[i] += k[i] + e[i] + m[i];
			avg[0] += k[i];
			avg[1] += e[i];
			avg[2] += m[i];
		}
		for(int i = 0; i <= 9; i++) {
			System.out.println(i + 1 + "번 학생의 국어  영어  수학");
			System.out.println(k[i] +"  " + e[i] + "   " + m[i]);
			System.out.println(i + 1 + "번 학생의 점수 총점의 평균은" + sum[i] / 3);
			
		}
		System.out.println();
		System.out.println("국어 점수 총점의 평균은" + avg[0] / 10);
		System.out.println("영어 점수 총점의 평균은" + avg[1] /10 );
		System.out.println("수학 점수 총점의 평균은" + avg[2] / 10);
		
	}

}
