/** File        : ObatTidakTersedidException.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : Eksepsi buatan sendiri, gagal ,melakukan pembelian obat jika obat tidak tersedia
 * Tanggal      : 07/02/2024 */

public class ObatTidakTersediaException extends Exception {
    public ObatTidakTersediaException() {
        super("Obat tidak tersedia");
    }
}
