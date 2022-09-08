import java.util.Scanner;
import java.math.BigInteger;

class Soal6
{
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		
		BigInteger a = new BigInteger(myObj.nextLine());
		
		BigInteger b = new BigInteger(myObj.nextLine());
		
		
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		
	}

}