public class NthPrime{
	public static void main(String [] args){
		
		System.out.println("enter nth prime");
		int nth = IO.readInt();
		
		while (nth < 1){
			IO.reportBadInput();
			nth = IO.readInt();
		}
		
		int num = 1;
		int count = 0;
		int i = 1;

		while (count < nth){
			num = num + 1;
			
			for (i = 2; i <= num; i++){
				if (num%i == 0){
					break;
				}
			}
			
			if ( i == num){
				count++;
			}
		}
		IO.outputIntAnswer(num);
	}
}