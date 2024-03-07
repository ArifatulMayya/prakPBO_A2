/** File        : BatasObatPenuhException.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : Eksepsi buatan sendiri, menolak pembelian obat jika sudah mencapai batas
 * Tanggal      : 07/02/2024 */

public class BatasObatPenuhException extends Exception {
    public BatasObatPenuhException() {
        super("Jumlah obat sudah mencapai batas");
    }
}
