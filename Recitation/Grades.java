public class Grades{
	public static void main(Sting [] args){
		int sum = 0;
		int lowest = 101;
		int avg;
		int [] [] grades = {
								{90, 100, 95, 99, 89, 100},
								{78, 59, 80, 77, 40, 45},
								{99, 80, 85, 82, 91, 90},
								{49, 60, 35, 75, 50, 60},
								{100, 90, 87, 95, 70, 0},
		};
		for(int i = 0; i < grades.length(); i++){
			for(int j = 0; j < grades[0].length(); j++){
				if(grades[i][j] < lowest){
					grades[i][j] = lowest;
				}
				sum += grades[i][j];
			}
			sum -= min;
			avg = sum/5;
			if(avg >= 70){
				System.out.println("Student " + (i+1) + " passed the class with a grade of 70 or higher.");
			}
		}
	}
}
//Big O(n * m)
//n = # number of students, m = # of grades
//the highest possible grade is 100
//for indivdual student it is O(m)
//for indivdual grade check each student at that one grade O(n)
//dropping another grade wouldnt change anything, you would still have to check every single thing, O(n * m)
//O(n*m) + O(n) + O(n) = O(n*m + 2n) = Big O(n*m)
//O(n) + O(n) = O(2n) = Big O(n)