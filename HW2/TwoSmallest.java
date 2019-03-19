public class TwoSmallest{
    public static void main (String [] args){
        
        double terminator;
        System.out.print ("Please enter terminating value: ");
        terminator = IO.readDouble();

        double lowest1;
        double lowest2;
        System.out.println("Please enter sequence of numbers:");
        
        lowest1 = IO.readDouble();
        while (lowest1 == terminator){
            IO.reportBadInput();
            lowest1 = IO.readDouble();
        }
        
        lowest2 = IO.readDouble();
        while (lowest2 == terminator){
            IO.reportBadInput();
            lowest2 = IO.readDouble();
        }
        
        double input;
        do{
            input = IO.readDouble();
            if (input < lowest1)
            {
                if(lowest2 < lowest1)
                    lowest2 = lowest1;
                lowest1 = input;
            }
            else if (input < lowest2)
                lowest2 = input;
        }while (input != terminator);
        IO.reportBadInput();

        System.out.println("RESULT: " + lowest1);
        System.out.println("RESULT: " + lowest2);
    }
}