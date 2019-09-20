import java.util.*;
public class BMI_Calculator {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the BMI Calculator, please choose your prefered system\n"
				+ "Enter 1 for imperal\n"
				+ "Enter 2 for international\n");
		
		boolean system = true;
		int option;
		double BMI;
		double weight;
		double height;
		
		
		while(true) {	
			System.out.print("\nOption #:");
			try {
				option = userInput.nextInt();
				if(option == 1 || option == 2) {
					if(option == 1) {
						system = false;
					}
					break;
				}else {
					System.out.print("Invalid choise, try again");
				}
			}catch(InputMismatchException  e){
				System.out.print("Invalid choise, try again");
				userInput.next();
			}
			
		}
		
		
		if(system == true) {
			System.out.print("Please enter your weight in Kilograms: ");
			weight = userInput.nextDouble();
			
			System.out.print("Please enter your height in meters: ");
			height = userInput.nextDouble();
			
			BMI = weight / (height * height);
			System.out.printf("Your BMI is: %.2f", BMI);
		}else {
			System.out.print("Please enter your weight in Pounds: ");
			weight = userInput.nextDouble();
			
			System.out.print("Please enter your height in inches: ");
			height = userInput.nextDouble();
			
			BMI = (703 * weight)/ (height * height);
			System.out.printf("Your BMI is: %.2f", BMI);
		}
		
	}

}
