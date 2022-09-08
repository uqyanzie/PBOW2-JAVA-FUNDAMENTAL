package Soal3;

class FloatingPoint{
	public static void main(String[] args) {
		double x = 92.98;
		int nx = (int) Math.round(x);
		
		System.out.println(x);
		System.out.println(nx);
	}
}


/*
 * Nilai nx setelah digunakan Math.round(x)?
 * Nilai nx diassign nilai dari Math.round(x)
 * dimana method round() dari class Math ini
 * berfungsi untuk membulatkan bilangan ril
 * secara umum (bukan spesifik membulatkan 
 * ke bawah atau ke atas). Dapat dipastikan
 * nilai nx adalah nilai bulat dari x berkat
 * dioperasikannya method Math.round() dengan
 * x sebagai argumennya.
 * 
 * Kenapa dibutuhkan cast (int)?
 * Karena semula nilai x adalah bertipe double
 * yang dimana tipe double tidak bisa sembarangan
 * dilakukan assignment terhadap tipe lain.
 * Sehingga dibutuhkanlah casting sebagai upaya 
 * mengkonversi tipe data.
 * Berkat dilakukannya casting dari tipe double
 * ke integer, maka nx dapat menampung nilai bulat
 * dari x.
 * Jika tidak dilakukan casting pada proses assignment,
 * maka akan terjadi error pada proses eksekusi kode
 * karena kesalahan mismatch tipe data.
 */