package Exam05;

public class StringCharAt {
	public static void main(String[] args) {
		String s = "�ڹ� ���α׷���";
		System.out.println(s.charAt(1));
		
		String subject = "�ڹ� ���α׷���";
		int index = subject.indexOf("����");
		System.out.println(index);
		
		System.out.println(subject.replace("�ڹ�", "java")); 
		subject = subject.replace("�ڹ�", "java");
	}
}
