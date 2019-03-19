public class Scores{
    public static void main(String [] args){

        System.out.println("Enter number of judges.");
        int j = IO.readInt();

        while (j < 3) {
            IO.reportBadInput();
            System.out.println("Enter number of judges.");
            j = IO.readInt();
        }

        int count = 0;
        double sum = 0;
        double highest = 0.0;
        double lowest = 10.0;
        double score = 0;
        double average = 0;
        
        for (count = 0; count < j; count++) {
            System.out.println("Enter score");
            score = IO.readDouble();
            sum = sum + score;

            while (score > 10.0 || score < 0.0) {
                IO.reportBadInput();
                System.out.println("Enter score");
                score = IO.readDouble();
            }

            if (score > highest) {
                highest = score;
            } 
            if (score < lowest){
                lowest = score;

                
            }
        
        }
        sum = sum - (highest + lowest);
        average = sum / (j - 2);


        System.out.println("The sum is:" + sum + "\n" + "The average is:" + average);
    }
}