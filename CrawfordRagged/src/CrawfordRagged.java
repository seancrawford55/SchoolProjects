import java.util.*;


public class CrawfordRagged {

	public static void main(String[] args) {
		int rowlength = 5;
		int sum = 0, min = 100, max = 0, avg = 1;
		int [] [] ragged = new int [5] [rowlength];
		Scanner myObj = new Scanner(System.in);
		for(int i = 0; i < ragged.length; i++) {
			System.out.println("How many figures in this row?");
			rowlength = myObj.nextInt();
			for(int j = 0; j < rowlength; j++) {
				System.out.println("What are the values in this row?");
				int x = myObj.nextInt();
				ragged[i][j] = x;
			}
			
		}
		for(int k = 0; k < ragged.length; k++) {
			for(int p = 0; p < rowlength; p++) {
				sum = sum + ragged[k][p];
				
				avg = sum / ragged[k].length;
				
				if(max < ragged[k][p]) {
					max = ragged[k][p];
				}
				
				if (min > ragged[k][p]) {
					min = ragged[k][p];
				}
				System.out.println("The sum of this row is " + sum);
				System.out.println("The average of this row is " + avg);
				System.out.println("The max of this row is " + max);
				System.out.println("The min of this row is " + min);
				
			}
		}

	}

}
