public class Produk {
	private String namaProduk;
    private double hargaProduk;
    private int quantityProduk;
    public Produk(String nama, int harga, int jumlah){
        this.namaProduk = nama;
        this.hargaProduk = harga;
        this.quantityProduk = jumlah;
    }
    public boolean isOutOfStock(int jumlah){
        if(jumlah>quantityProduk){
            System.out.println("STOK BARANG KURANG !");
            return true;
        }else
            return false;
    }
	public String getNamaProduk() {
		return namaProduk;
	}
	public void setNamaProduk(String namaProduk) {
		this.namaProduk = namaProduk;
	}
	public double getHargaProduk() {
		return hargaProduk;
	}
	public void setHargaProduk(double hargaProduk) {
		this.hargaProduk = hargaProduk;
	}
	public int getQuantityProduk() {
		return quantityProduk;
	}
	public void setQuantityProduk(int quantityProduk) {
		this.quantityProduk = quantityProduk;
	}
}