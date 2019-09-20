import java.text.DecimalFormat;
import java.util.*;

public class Survey {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00"); 
		
		String[] topics = {"Global Warming", "Technology", "Student Loans", "Work/study", "Good sleep"};
		int rating[][] = new int[5][10];
		
		int counter = 0;
		double avg= 0.0;
		int minNum = 0;
		int maxNum = 0;
		int minNumRow = 0;
		int maxNumRow = 0;
		
		System.out.println("Please rate the following from 1 (least important) to 10 (most important)");
		for(int i = 0; i < 10; i++) {
			System.out.println("User " + (i + 1) + " Please enter your rating for the following: ");
			
			for(int j = 0; j < 5; j++) {
				System.out.print(topics[counter] + ": ");
				counter++;
				rating[j][i] = userInput.nextInt();	
			}
			counter = 0;
			System.out.println();
		}
		
		
		
		System.out.println("\n\nResults:\n");
		for(int i = 0; i < 5; i++) {
			System.out.print(topics[i] + "\t");
			for(int j = 0; j < 10; j++) {
				System.out.print(rating[i][j] + "\t");
				avg += (double)rating[i][j];
			}
			counter = (int)avg;
			avg /= 10.0;
			
			System.out.println("average = " + df.format(avg));
		
			if(minNum == 0) {
				minNum = counter;
				minNumRow = i;
			}
			if(counter < minNum) {
				minNum = counter;
				minNumRow = i;
			}
			if(counter > maxNum) {
				maxNum = counter;
				maxNumRow = i;
			}
			avg = 0;
		}
		
		System.out.println("\n");
		
		switch(minNumRow) {
			case 0:
				System.out.println("The issue with least importance is " + topics[minNumRow] + " with a total of: " + minNum);
				break;
			case 1:
				System.out.println("The issue with least importance is " + topics[minNumRow] + " with a total of: " + minNum);
				break;
			case 2:
				System.out.println("The issue with least importance is " + topics[minNumRow] + " with a total of: " + minNum);
				break;
			case 3:
				System.out.println("The issue with least importance is " + topics[minNumRow] + " with a total of: " + minNum);
				break;
			case 4:
				System.out.println("The issue with least importance is " + topics[minNumRow] + " with a total of: " + minNum);
				break;
			default:
				break;
		}
		
		System.out.println("\n");
		
		switch(maxNumRow) {
			case 0:
				System.out.println("The issue with most importance is " + topics[maxNumRow] + " with a total of: " + maxNum);
				break;
			case 1:
				System.out.println("The issue with most importance is " + topics[maxNumRow] + " with a total of: " + maxNum);
				break;
			case 2:
				System.out.println("The issue with most importance is " + topics[maxNumRow] + " with a total of: " + maxNum);
				break;
			case 3:
				System.out.println("The issue with most importance is " + topics[maxNumRow] + " with a total of: " + maxNum);
				break;
			case 4:
				System.out.println("The issue with most importance is " + topics[maxNumRow] + " with a total of: " + maxNum);
				break;
			default:
				break;
		}
		
		
		
		
	}
}
