import java.util.Scanner;

class Soal5
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Input for String A : ");
		String A = input.nextLine();
		System.out.print("Input for String A : ");
		String B = input.nextLine();
		String Concat = (A.substring(0,1).toUpperCase() + A.substring(1)) + " " + (B.substring(0,1).toUpperCase() + B.substring(1));
		
		System.out.println(A.length() + B.length());
		System.out.println((A.compareTo(B) > 0)? "Yes" : (A.compareTo(B) == 0)? "Equal":"No");
		System.out.println(Concat);
		
	}
}