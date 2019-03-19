public static void main(String [] args){

		System.out.println("Enter the constant d:");
		int d = IO.readInt();

		System.out.println("Enter the constant f:");
		int f = IO.readInt();

		System.out.println("Enter the constant g:");
		int g = IO.readInt();

		System.out.println("Enter the constant m:");
		int m = IO.readInt();

		System.out.println("Enter the constant b:");
		int b = IO.readInt();

		int A = d;
		int B = f - m;
		int C = g - b;

		double x1 = (-B + Math.sqrt(B*B - 4*A*C)) / (2*A);
		double x2 = (-B - Math.sqrt(B*B - 4*A*C)) / (2*A);

		double y1 = m * x1 + b;
		double y2 = m * x2 + b;

		System.out.println("The intersection(s) is/are:" + "\n" + "(" + x1 + "," + y1 + ")" + "\n" + "(" + x2 + "," + y2 + ")" + "\n");
 


        if (d == 0){
            
            if (f == m){
                
                if (g == b)
                    System.out.println("There are infinite amount(s) of intersection(s)");
                
                else
                    System.out.println("There are no intersection(s)");
            }
        }
	}