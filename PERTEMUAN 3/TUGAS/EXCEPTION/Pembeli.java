/** File        : Pembeli.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File class pembeli dengan menerapkan exception buatan sendiri
 * Tanggal      : 07/02/2024 */

public class Pembeli {
    private String nama;
    private Obat[] keranjangObat;
    private int jumlahObat;

    public Pembeli(String nama) {
        this.nama = nama;
        keranjangObat = new Obat[5];
        jumlahObat = 0;
    }

    public String getNama() {
        return nama;
    }

    public Obat[] getKeranjangObat() {
        return keranjangObat;
    }

    public int getJumlahObat() {
        return jumlahObat;
    }

    public void beliObat(Obat obat) throws BatasObatPenuhException, ObatTidakTersediaException {
        if (!obat.isTersedia()) {
            throw new ObatTidakTersediaException();
        }
        if (jumlahObat == keranjangObat.length) {
            throw new BatasObatPenuhException();
        }
        keranjangObat[jumlahObat] = obat;
        System.out.println(this.getNama() + " Berhasil membeli " + obat.getNama());
        jumlahObat++;
    }
}
