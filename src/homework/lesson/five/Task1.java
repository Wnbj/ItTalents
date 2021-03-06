package homework.lesson.five;

public class Task1 {
	public static void main(String[] args) {
		
		int[][] table = {
				{48,72,13,14,15},
				{21,22,53,24,75},
				{31,57,33,34,35},
				{41,95,43,44,45},
				{59,52,53,54,55},
				{61,69,63,64,65}
				}; 
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[1].length; j++) {
				if (table[i][j] < min) {
					min = table[i][j];
				}
				if (table[i][j] > max) {
					max = table[i][j];
				}
			}
		}
		
		System.out.printf("min = %d%n", min);
		System.out.printf("max = %d", max);
		
	}
}
