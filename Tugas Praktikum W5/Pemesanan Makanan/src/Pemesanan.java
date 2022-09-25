public class Pemesanan {
    private String produk;
    private int kuantitas;
    private double hargatotal;
    public Pemesanan(Produk beliItem, int kuantitas){
        this.produk = beliItem.getNamaProduk();
        this.kuantitas = kuantitas;
        beliItem.setQuantityProduk(beliItem.getQuantityProduk()-kuantitas);
        this.hargatotal = beliItem.getHargaProduk() * kuantitas;
    }
    public void toPrint(){
        System.out.printf("%-20s [%02d]  Rp. %.0f\n", produk, kuantitas, hargatotal);
    }
    public static double countTotal(Pemesanan[] items){
        double total = 0;
        for(Pemesanan item: items){
            if (item != null)
                total += item.getHargatotal();
        }
        return total;
    }
    public String getProduk() {
        return produk;
    }
    public void setProduk(String produk) {
        this.produk = produk;
    }
    public int getKuantitas() {
        return kuantitas;
    }
    public void setKuantitas(int kuantitas) {
        this.kuantitas = kuantitas;
    }
    public double getHargatotal() {
        return hargatotal;
    }
    public void setHargatotal(double hargatotal) {
        this.hargatotal = hargatotal;
    }
}