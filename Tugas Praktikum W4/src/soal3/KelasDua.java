package soal3;

public class KelasDua {
	{
		System.out.println(5);
	}
	
		public static void main(String[] args)
	{
		System.out.println(6);
		KelasSatu satu = new KelasSatu();
		KelasSatu dua = new KelasSatu(10);
		
		/*
		 * OUTPUT :
		 * 6 -> pertama kali di main
		 * 2 -> static di Object satu
		 * 11 -> di dalam blok melalui constructor
		 * 4 -> melalui constructor tanpa parameter
		 * 11 -> di dalam blok melalui constructor di Object dua
		 * 3 -> lewat constructor dengan parameter
		 * */
	}

}
