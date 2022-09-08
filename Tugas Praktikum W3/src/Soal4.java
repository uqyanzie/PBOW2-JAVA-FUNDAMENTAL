import java.util.Scanner;

class Soal4
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		
		float primeSalary = 500000;
		
		System.out.print("Input Jumlah Penjualan : ");
		int totalSale = myObj.nextInt();
		
		float itemPrice = 50000;
		
		float bonusPerSale = totalSale * (itemPrice * 10 / 100);  
		
		float achievement = 0;
		
		if(totalSale > 80)
		{
			achievement =  totalSale * (itemPrice * 35 / 100);
		}
		else if(totalSale >= 40 && totalSale < 80) 
		{
			achievement =  totalSale * (itemPrice * 25/100);
		}
		else if(totalSale < 15)
		{
			achievement = (totalSale - 15) * (itemPrice * 15/100);
			bonusPerSale = 0;
		}
		
		
		float totalSalary = primeSalary + bonusPerSale + achievement;
		
		System.out.println("Gaji Pokok		: " + primeSalary 
				+ "\nBonus Penjualan		: " + bonusPerSale 
				+ "\nBonus / Denda	: " + achievement);
		System.out.println("Total Gaji		: " + totalSalary);
	}
}