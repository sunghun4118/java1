package exam_01;

public class AdvanceForExample {
	public static void main(String[] args) {
//		int[] scores = { 95, 71, 84, 93, 87 };
//		
//		int sum = 0;
//		for (int score : scores) {
//			sum = sum + score;
//		}
//		System.out.println("Á¡¼ö ÃÑÇÕ  = " + sum);
//		
//		double avg = (double) sum / scores.length;
//		System.out.println("Á¡¼ö Æò±Õ  = " + avg); 
//	}
//
//}
		int[] scores = { 95, 71, 84, 93, 87 };		
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}
		for(int score:scores) {
			sum = sum + score;
		}
		
		int[][] sc = {{1,2,3,},{4,5,6},{7,8,9}};
		
		for(int i = 0; i < sc.length; i++) {
			for(int j = 0; j < sc.length; j++) {
			System.out.println(i + "Çà" + j + "¿­" + sc[i][j]);
		}
	}
	for(int[] ii : sc) {
		for(int jj : ii) {
			System.out.println(jj);
		}
	}
	}
}
