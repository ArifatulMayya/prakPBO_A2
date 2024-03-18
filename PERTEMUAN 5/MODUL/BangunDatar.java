/** File        : BangunDatar.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : Kelas absatrak, berisi abstraksi bangun datar
 * Tanggal      : 18/03/2024 */

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = 1;
    }

    public double getLuas(){
        return luas;
    }

}