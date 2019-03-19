public class SimplifyFractions{
	public static void main(String [] args){
	
	int numerator = IO.readInt();
	int denomerator = IO.readInt();

	if(denomerator == 0){
		System.out.println("Error");
	return;
}
	
	int gcf = AI.gcf(numerator, denomerator);
		numerator /= gcf; /*same as numerator = numerator / gcf*/
		denomerator /= gcf;
		System.out.println(numerator + "/" + denomerator);
	}
}