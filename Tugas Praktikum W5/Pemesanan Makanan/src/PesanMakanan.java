import java.util.Scanner;

public class PesanMakanan {
	private static Produk[] bikinMenu() {
		Produk[] menu = new Produk[10];
		menu[0] = new Produk("Batagor", 5000, 20);
		menu[1] = new Produk("Nasi Rames", 11000, 20);
		menu[2] = new Produk("Mie Ayam", 8500, 20);
		menu[3] = new Produk("Ayam Geprek", 9000, 20);
		menu[4] = new Produk("Nasi Goreng", 10000, 20);
		menu[5] = new Produk("Ayam Nyemek", 10000, 20);
		menu[6] = new Produk("Roti Bakar", 12000, 20);
		menu[7] = new Produk("Nasi Uduk", 7000, 20);
		menu[8] = new Produk("Nasi Goreng", 10000, 20);
		menu[9] = new Produk("Ayam Katsu", 5000, 20);
		return menu;
	}
	
	public static void main(String[] args) {
		
		Produk[] menu = bikinMenu();
		System.out.println("No. Nama Menu   \tHarga Produk\tStok");
		for (int i = 0; i < menu.length; i++) {
			System.out.printf("%d.  %s     \t%.0f \t\t[%d]\n", i+1, menu[i].getNamaProduk(), menu[i].getHargaProduk(), menu[i].getQuantityProduk());
		}
		
		Scanner input = new Scanner(System.in);
		char ulang = 'n';
		int pilihan;
		int iterasiPesanan=0;
		int jumlahPesanan;
		int uangBayar;
		Pemesanan[] pesan = new Pemesanan[3];
		
		System.out.printf("=======================================\n");
		do{ 
            do{
                System.out.print("Pilih nomor pesanan : ");
                pilihan = input.nextInt();
            }while(pilihan<1 || pilihan>menu.length);
            
            do{
                System.out.print("Masukkan jumlah beli : ");
                jumlahPesanan = input.nextInt();
            }while(jumlahPesanan<1 || menu[pilihan-1].isOutOfStock(jumlahPesanan));
            
            pesan[iterasiPesanan] = new Pemesanan(menu[pilihan-1], jumlahPesanan);
            System.out.print("Pesan ulang ? [Y/N] : ");
            ulang = input.next().charAt(0);
            iterasiPesanan++;
        }while((ulang=='y'||ulang=='Y') && iterasiPesanan<pesan.length);
        double all_total = Pemesanan.countTotal(pesan);
        System.out.printf("=======================================\n");
        System.out.println("RINCIAN PEMESANAN : ");
        for(int i=0; i<iterasiPesanan; i++){
            pesan[i].toPrint();
        }
        System.out.printf("%-26s Rp. %.0f\n","TOTAL : ", all_total);
        do{
            System.out.print("Masukkan jumlah uang : ");
            uangBayar = input.nextInt();
            if(uangBayar<Pemesanan.countTotal(pesan))
               System.out.println("UANG TIDAK CUKUP!");
        }while(uangBayar<1||uangBayar<all_total);
        double kembalian = uangBayar - all_total;
        System.out.printf("%-26s Rp. %.0f\n","TOTAL KEMBALIAN : ", kembalian);
        System.out.printf("=======================================\n");
	}
}

