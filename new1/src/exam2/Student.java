��package exam2;

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
		System.out.println("1.�����Է�  2.������ȸ  3.��ü������ȸ  4.����");
		System.out.println("---------------------------------");
		int num = scan.nextInt();
		switch(num) 
		{
			case 1:
				System.out.println("��� �л��� ������ �Է� �Ͻðڽ��ϱ�?");
				System.out.println("------------------------");
				num = scan.nextInt();
				System.out.println(num + "�� �л��� ���� ������ �Է� �� �ּ���");
				grade.Grade[num][0] = scan.nextInt();
				System.out.println(num + "�� �л��� ���� ������ �Է� �� �ּ���");
				grade.Grade[num][1] = scan.nextInt();
				System.out.println(num + "�� �л��� ���� ������ �Է� �� �ּ���");
				grade.Grade[num][2] = scan.nextInt();
				break;
				
			case 2:
				System.out.println("��� �л��� ������ �Է� �Ͻðڽ��ϱ�?");
				System.out.println("------------------------");
				num = scan.nextInt();
				
				System.out.println("�̸�: " + grade.name[num]);
				System.out.println("�̸�: " + grade.name[num]);
				
				System.out.println(num + "�� �л��� ����	����	����");
				System.out.println("    " + grade.Grade[num][0] + "    " + grade.Grade[num][1] + "    "+ grade.Grade[num][2]);
				System.out.println(num + "�� �л��� ���� �����" + grade.summ(num) );
				grade.Grade[num][2] = scan.nextInt();
				break;
		}
		}
	}

}
