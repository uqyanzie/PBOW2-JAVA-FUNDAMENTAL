public class Restaurant {
    private Menu[] menu;
    private byte id;
    public Restaurant(){
        menu = new Menu[10];
        for(int i=0; i<10; i++)
            menu[i] = new Menu();
        id=0;
    }
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.menu[id].setNamaMenu(nama);
        this.menu[id].setHargaMenu(harga);
        this.menu[id].setStokMenu(stok);
        nextId();
    }
    private int searchmenuByName(String nama){
        int id_pesan = -1;
        for(int i = 0; i < id; i++){
            id_pesan = nama.equals(menu[i].getNamaMenu()) ?  i : id_pesan;
        }
        return id_pesan;
    }
    public void pesanMenu(String nama_menu, double uang, int jumlah_pesan){
        int id_pesan = searchmenuByName(nama_menu);
        
        if(id_pesan == -1){
            System.out.println("menu tidak ada !");
            return;
        }
        double total_harga = menu[id_pesan].getHargaMenu()*jumlah_pesan;
        if(menu[id_pesan].getStokMenu() < jumlah_pesan){
            System.out.println("Stok "+menu[id_pesan].getNamaMenu()+" kurang !");
            return;
        }
        if(total_harga > uang){
            System.out.println("Uang anda tidak cukup !");
            return;
        }
        menu[id_pesan].setStokMenu( menu[id_pesan].getStokMenu() - jumlah_pesan);
        double kembalian = uang - total_harga;
        System.out.println("PESANAN BERHASIL !");
        System.out.println(jumlah_pesan+" "+menu[id_pesan].getNamaMenu()+ " : Rp. "+total_harga);
        System.out.println("Total Kembalian : " + kembalian);
    }
    private void tampilmenu(int id){
        System.out.println(menu[id].getNamaMenu()+"["+menu[id].getStokMenu()+"]"+"\tRp. "+menu[id].getHargaMenu());
    }
    public void tampilMenuMakanan(){
        for(int i=0; i<=id; i++){
            if(!isOutOfStock(i)){
                tampilmenu(i);
            }
        }
    }
    private boolean isOutOfStock(int id){
        if(menu[id].getStokMenu() == 0){
            return true;
        }else{
            return false;
        }
    }
    private void nextId(){
        id++;
    }
}