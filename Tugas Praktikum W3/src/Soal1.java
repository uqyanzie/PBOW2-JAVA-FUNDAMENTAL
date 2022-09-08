import java.util.Scanner;

class Soal1
{
	public static void main(String args[])
	{
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Masukkan sebuah string : ");
		String s = myObj.nextLine();
		
		String[] arrOfStr = s.split("[, ?.@!_']+");
		
		System.out.println(arrOfStr.length);
		
		for (String n : arrOfStr)
			System.out.println(n);
	}
}