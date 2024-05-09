/** File        : Data.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Class Data
 * Tanggal      : 09/05/2024 */

public class Data<T extends Kupu> {
    private T kupu;

    public T getIsi() {
        return kupu;
    }

    public void setIsi(T faseKupu) {
        kupu = faseKupu;
    }

    public void gerak() {
        kupu.gerak();
    }
}
