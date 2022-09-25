public class Menu {
    private String namaMenu;
    private double hargaMenu;
    private int stokMenu;
    public Menu(){
        namaMenu = "-";
        hargaMenu = 0;
        stokMenu = 0;
    }
    public void setNamaMenu(String nama){
        this.namaMenu = nama;
    }
    public String getNamaMenu(){
        return this.namaMenu;
    }
    public void setHargaMenu(double harga){
        this.hargaMenu = harga;
    }
    public double getHargaMenu(){
       return this.hargaMenu;
    }
    public void setStokMenu(int stok){
        this.stokMenu = stok;
    }
    public int getStokMenu(){
        return this.stokMenu;
    }
}