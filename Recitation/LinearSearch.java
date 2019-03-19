public class LinearSearch{
	public static void main(String [] args){
		int [] num = new int (10);
		Random rand = new Random();
		for(int i = 0; i < num.length(); i++){
			num[i] = ran.nextInt(20);
		}

		System.out.println("What number are you searching for?");
		int target = IO.readInt();
		for(int i = 0; i < num.length(); i++){
			if(num[i] == target){
				System.out.println("The number us at index " + i);
				return;
			}
		}
		System.out.println("Did not find the number you are looking for");
	}
}
///Big O(n),
// where n is the number of elements in your array
// best case: O(1), you find the number at index