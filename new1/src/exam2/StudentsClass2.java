package exam2;

public class StudentsClass2 {
	
	int[][] Grade = new int[11][3];
	double[] sum = new double[11];
	double[] avg = new double[3];

	String[] name = new String[11];
	String[] phone = new String[11];
	
	double summ(int number) {
		sum[number] = Grade[number][0] + Grade[number][1] + Grade[number][2];
	return sum[number];
			
	}
}
