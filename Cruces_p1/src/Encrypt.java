import java.util.*;
public class Encrypt {

	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		Decrypt decryptor = new Decrypt();
		int placeHolder = 0;
		

		System.out.print("Enter first number: ");
		int num1 = userInput.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = userInput.nextInt();
		
		System.out.print("Enter third number: ");
		int num3 = userInput.nextInt();
		
		System.out.print("Enter fourth number: ");
		int num4 = userInput.nextInt();
		
		System.out.println("\nYour numbers are: " + num1 + "-" + num2 + "-" + num3 + "-" +num4);
		
		int key1;
		int key2;
		int key3;
		int key4;
		
		placeHolder = num1 + 7;
		num1 = (num1 + 7) % 10;
		key1 = placeHolder / 10;
		
		placeHolder = num2 + 7;
		num2 = (num2 + 7) % 10;
		key2 = placeHolder / 10;
		
		placeHolder = num3 + 7;
		num3 = (num3 + 7) % 10;
		key3 = placeHolder / 10;
		
		placeHolder = num4 + 7;
		num4 = (num4 + 7) % 10;
		key4 = placeHolder / 10;
		
		placeHolder = num3;
		num3 = num1;
		num1 = placeHolder;
		
		placeHolder = num4;
		num4 = num2;
		num2 = placeHolder;
		
		System.out.println("Encrypted numbers are: " + num1 + "-" +num2 + "-" + num3 + "-" +num4);
		
		
		decryptor.decrypt(num1, num2, num3, num4, key1, key2, key3, key4);
		System.out.println(decryptor);
		
		
	}

}
