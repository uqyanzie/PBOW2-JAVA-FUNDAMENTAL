public class Soal1
{
	public static void main (String[] args)
	{
		byte angka1 = 125;
		byte angka2 = 6;
		byte hasil = (byte) (angka1 + angka2);
		
		System.out.println(angka1 + " + " + angka2);
		System.out.println("Hasil : " + hasil);
		System.out.println();
		for(byte i = 0; i <= angka2; i++)
			System.out.println((byte) (angka1 + i)); 
	}
}