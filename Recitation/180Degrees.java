public class 180Degrees{
	public static void main(String[] args){
	int [] [] arr = {
		{4,3,5,6},
		{1,5,8,2},
		{4,7,1,0},
		{5,1,5,8},
		{1,8,4,2} };
		System.out.println("The orginal array:");

		for(int i = 0; i < arr.length; i++){
			for(int k = 0; k < arr[i].length; k++){
				System.out.print(arr[i][k]);
			}
			System.out.println();
		}

		for(int i = 0; i < arr.length; i++){
			for(int k = 0; k < arr[i].length/2; k++){
				int temp = arr[i][k];
				arr[i][k] = arr[i][arr[0].length - k - 1];
				arr[i][arr[0].length - k - 1] = temp;
				//swaps numbers in the row
			}
		}
		System.out.println("The 180 degree rotation of the array:");
		for(int i = 0; i < arr.length/2; i++){
			int [] temp = arr[i];
			arr[i] = arr[arr.length - i -1];
			arr[arr.length - i -1] = temp;
			//swaps the order of the rows
		}
		
		for(int k = 0; k < arr[i].length; k++){
			System.out.print(arr[i][k]);
		}
		System.out.println();
	}
}