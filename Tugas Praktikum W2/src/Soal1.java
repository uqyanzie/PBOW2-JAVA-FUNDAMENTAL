import java.util.Scanner;

class Soal1
{
	public static void main(String[] args) 
	{
		try 
		{
			Scanner number = new Scanner(System.in); // mendeklarasikan objek Scanner
			System.out.print("input any number : ");
			String number_input = number.nextLine(); // menerima input sebagai tipe string
			// mengkonversi angka dalam bentuk string menjadi tipe long
			Long long_num = Long.parseLong(number_input); 
			System.out.println(long_num + " Can be fitted in : ");
			if(long_num <= Byte.MAX_VALUE && long_num >= Byte.MIN_VALUE) // kondisi dalam range byte
				System.out.println("* byte");
			if(long_num <= Short.MAX_VALUE && long_num >= Short.MIN_VALUE) // kondisi dalam range short
				System.out.println("* Short");
			if(long_num <= Integer.MAX_VALUE && long_num >= Integer.MIN_VALUE) // kondisi dalam range integer
				System.out.println("* Int");
			
			System.out.println("* Long");
		} catch(NumberFormatException e) // handling jika terjadi error dalam konversi
		{
			System.out.println("Number input can't be fitted anywhere");
		}
	}
}