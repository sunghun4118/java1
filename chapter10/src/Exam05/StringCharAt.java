package Exam05;

public class StringCharAt {
	public static void main(String[] args) {
		String s = "자바 프로그래밍";
		System.out.println(s.charAt(1));
		
		String subject = "자바 프로그래밍";
		int index = subject.indexOf("프로");
		System.out.println(index);
		
		System.out.println(subject.replace("자바", "java")); 
		subject = subject.replace("자바", "java");
	}
}
