package Soal2;

public class Constants 
{
	public static void main(String[] args) 
	{
		final double CM_PER_INCH = 2.54;//variabel CM_PER_INCH hanya dapat 
		double paperWidth = 8.5;		//digunakan di dalam method main
		double paperHeight = 11;
		System.out.println("Paper size in centimeters: " +
		paperWidth * CM_PER_INCH + " by " + paperHeight *
		CM_PER_INCH);
	}
	
}


/*
 * Output dari masing-masing class keluar dengan nilai yang sama.
 * 
 * final double 
 * dalam perbandingan ini, digunakan untuk membuat variabel/method lokal dalam sebuah 
 * method dengan nilai tetap dan mencegah overriding.
 * Dalam kasus pada class Constants, variabel CM_PER_INCH akan bernilai tetap dan 
 * hanyalah dapat digunakan terbatas pada method main atau tidak dapat digunakan
 * diluar method lain meski di dalam class yang sama.
 * 
 * public static final double
 * dalam perbandingan ini, digunakan untuk mendeklarasikan sebuah variabel konstan
 * (bernilai tetap) yang dapat diakses oleh instance-instance lain di dalam class. 
 * Dalam kasus pada class Constants2, variabel CM_PER_INCH berlaku static yang 
 * artinya kepemilikannya adalah untuk class yang melingkupinya. Sehingga variabel
 * tersebut dapat digunakan pada block dan method yang lain yang masih berada di
 * dalam class yang sama.  
 * 
 * Keyword final adalah non-access modifier.
 * Penggunaan keyword final dalam pendeklarasian class, method, 
 * dan variabel bertujuan untuk mencegah pewarisan, modifikasi dan perubahan nilai.
 * 
 * Keyword static adalah pengindikasi bahwa sebuah variabel/method adalah milik
 * dari class yang melingkupinya. Sehingga penggunaan keyword static dalam 
 * pendeklarasian variabel atau method memungkinkan untuk digunakan tanpa harus
 * melakukan construct objek dari class yang bersangkutan.
 * 
 * Keyword public adalah access specifier yang digunakan untuk class, interfaces,
 * method, dan variabel yang mengindikasikan hal tersebut dapat diakses di sepanjang
 * program atau di tempat dimana suatu class menetapkan hal tersebut dapat diakses.
 */ 
 