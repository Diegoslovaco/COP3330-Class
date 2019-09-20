

public class Decrypt extends Encrypt{
	int decryptedNum1 = 0;
	int decryptedNum2 = 0;
	int decryptedNum3 = 0;
	int decryptedNum4 = 0;
	
	void decrypt(int num1, int num2, int num3, int num4, int key1, int key2, int key3, int key4) {
		int placeHolder = 0;
		
		placeHolder = num3;
		num3 = num1;
		num1 = placeHolder;
		
		placeHolder = num4;
		num4 = num2;
		num2 = placeHolder;
		
		decryptedNum1 = ((key1 * 10) + num1) - 7;
		decryptedNum2 = ((key2 * 10) + num2) - 7;
		decryptedNum3 = ((key3 * 10) + num3) - 7;
		decryptedNum4 = ((key4 * 10) + num4) - 7;
		
	}

	@Override
	public String toString() {
		return "Decrypted numbers are: " + decryptedNum1 + "-" + decryptedNum2 + "-" + decryptedNum3 + "-" + decryptedNum4;
	}
	
	
	

	

}


