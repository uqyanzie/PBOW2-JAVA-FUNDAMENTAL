public class Barang {
	String kode_barang;
	String nama_barang;
	private int stok;
	
	public Barang(String kode, String nama, int stk) {
		kode_barang = kode;
		nama_barang = nama;
		stok = stk;
	}
	
	public int getStok() {
		return this.stok;
	}
	
	public void addStok(int amount) {
		this.stok += amount;
	}
}
