package Soal4;

class ConvertDataType
{
	static short methodOne(long l) 
	{
		int i = (int) l;
		return (short) i;
	}
	
	public static void main(String[] args)
	{
		double d = 10.25;
		float f = (float) d;
		byte b = (byte) methodOne((long) f);
		System.out.println(d);
		System.out.println(f);
		System.out.println(b);
	}
}

/*
 * Output nilai variabel b = 10
 * Semula variabel d bertipe doubel menampung nilai
 * bilangan ril 10.25 dengan mengalokasi ruang 64bits s
 * (8 byte) di memori.
 * Variabel d kemudian di konversi menjadi bertipe float
 * yang mengalokasi ruang sejumlah 32bits (4 byte) di
 * memori. Upaya casting (konversi) tipe data ini diperlukan
 * karena mengingat alokasi ruang dari tipe awal double
 * lebih besar ketika akan dikonversi ke tipe float yang
 * alokasi ruang memorinya lebih kecil. Jika dalam hal
 * ini upaya casting tidak dilakukan, maka eksekusi
 * program akan error karena tidak muatnya kapasitas
 * ruang memori dari variabel penampung bertipe float
 * untuk menerima assignment dari tipe float
 * 
 * Jika upaya konversi yang dilakukan adalah sebaliknya,
 * (dari tipe float ke tipe double) maka dalam hal ini, 
 * bahasa pemrograman Java mengizinkan hal tersebut.
 * Hal itu dikarenakan tipe float mengalokasi ruang yang
 * lebih kecil dibanding tipe double, sehingga kemungkinan
 * kesalahan yang terjadi dalam sistem lebih kecil.
 * 
 * Adapun upaya casting pada baris selanjutnya berlangsung
 * sebagai berikut:
 * float -> long -> int -> byte
 * Konversi tipe float ke tipe long bertujuan untuk bisa
 * menjalankan methodOne yang menerima argumen bertipe long.
 * Jika tidak dikonversi ke bilangan bulat bertipe int atau 
 * long (lebih amannya), maka eksekusi methodOne akan
 * menghasilkan error karena kesalahan tipe data.
 * Setelah eksekusi dari methodeOne yang mengembalikan nilai
 * bertipe integer, nilai kembalian tersebut kemudian dicasting
 * lagi menjadi tipe integer untuk memperkecil ukuran bit dari 
 * data tersebut.
 * Sehingga dengan demikian diperolehlah nilai bulat dari 10.25 
 * yang dikonversi menjadi bilangan bulat bertipe byte, yakni
 * b bernilai 10 dengan sizes 8bits  
 *
 * 
 * 
 */