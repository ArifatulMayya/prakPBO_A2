/*
 * File         : Kubus.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Program Kubus
 * Tanggal      : 29/02/2024
 */

public class Kubus {
    private double sisi;

    public Kubus(double s) {
        this.sisi = s;
    }

    public void setSisi(double s) {
        this.sisi = s;
    }

    public double getSisi() {
        return this.sisi;
    }

    public double hitungVolume() {
        return this.getSisi() * this.getSisi() * this.getSisi();
    }

    public double hitungLuasPermukaan() {
        double luas = this.getSisi()*this.getSisi();
        return luas * 6;
    }



}