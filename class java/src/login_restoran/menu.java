package login_restoran;

public class menu {
    String nama;
    double harga;
    int id;
    public menu(int id, String nama, double harga){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }
    //class makanan
    public void MenuMakanan(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void MenuMinuman(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public String toString() {
        return "menu : " +
                nama + " || Rp." + harga;
    }
}
