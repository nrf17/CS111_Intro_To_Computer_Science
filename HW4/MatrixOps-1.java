public class MatrixOps
{
	public static double[][] multiply(double[][] matrix1, double[][] matrix2)
	{
		int r1 = matrix1.length();
		int c1 = matrix1[0].length();
		int r2 = matrix2.length();
		int c2 = matrix2[o].length();

		if(c1 == r2){
			double [] [] matrix3 = new double [r1] [c2];
			for(int i = 0; i < r1; i++){
				for(int j = 0; j < c2; j++){
					matrix3 [i] [j] = 0;
					for(int k = 0; k < c1; k++){
						matrix3 [i] [j] = matrix1 [i] [k] * matrix2 [k] [j];
					}
				}
				return matrix3;
			}
			else{
				return IO.reportBadInput();
			}
		}
	}
}
