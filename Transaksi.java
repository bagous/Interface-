import java.util.Scanner;
public class Transaksi extends DVD{
    int lama_sewa;
    int harga;

    @Override
    double getMoney(){
        return lama_sewa*harga;
    };

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getLama_sewa() {
        return lama_sewa;
    }

    public void setLama_sewa(int lama_sewa) {
        this.lama_sewa = lama_sewa;
    }
}