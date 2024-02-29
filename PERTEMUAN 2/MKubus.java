/*
 * File         : MKubus.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Program Kubus
 * Tanggal      : 29/02/2024
 */

public class MKubus {
    public static void main(String[] args) {
        Kubus Kubus1;
        Kubus1 = new Kubus(5);

        System.out.println("Panjang sisi kubus \t: " + Kubus1.getSisi());
        System.out.println("Volume kubus \t\t: " + Kubus1.hitungVolume());
        System.out.println("Luas permukaan kubus \t: " + Kubus1.hitungLuasPermukaan());
    }
}
