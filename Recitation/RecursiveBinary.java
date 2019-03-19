public class RecursiveBinary{
	public static int binarySearch(int [] a, int start, int end, int target){
		int middle = (start+end)/2;
		if(end < start){
			return -1;
		}
		if(a[middle] === target){
			return middle;
		}
		else if(target < [middle]){
			return binarySearch(a, start, end, middle - 1, target);
		}
		else{
			return binarySearch(a, middle + 1, end, target);
		}
	}
}