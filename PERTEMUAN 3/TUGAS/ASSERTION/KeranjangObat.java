
/** File        : KeranjangObat.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Class Keranjang Obat
 * Tanggal      : 07/02/2024 */

public class KeranjangObat {
    private String[] keranjang;
    private int size;

    public KeranjangObat() {
        keranjang = new String[5];
        this.size = 0;
    }

    public void tambahObat(String obat) {
        if(size < keranjang.length){
            keranjang[size] = obat;
            size += 1;
        }
        else {
            assert (size < keranjang.length): "Keranjang sudah penuh";
        }
    }

    public void tampilkanObat() {
        for (int i = 0; i < keranjang.length; i++) {
            System.out.println(keranjang[i]);
        }
    }
}


