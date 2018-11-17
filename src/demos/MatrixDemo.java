package demos;

public class MatrixDemo {

	public static void main(String[] args) {
		
		double[][] matrix = generateIdentityMatrix(5);
		
		printMatrix(matrix);

	}
	
	public static void printMatrix(double[][] matrix) {
		
		for(int r = 0; r < matrix.length; r++) {
			
			for(int c = 0; c < matrix[r].length; c++) {
				System.out.print(matrix[r][c]+ "\t");
			}
			
			System.out.println();
			
		}
		
	}
	
	public static double[][] generateIdentityMatrix(int size) {
		
		double[][] idMatrix = new double[size][size];
		
		for(int i=0; i < size; i++) {
			idMatrix[i][i] = 1.0;
		}
		
		return idMatrix;
	}
	
}
