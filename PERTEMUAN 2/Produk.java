/*
 * File         : Produk.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Class Produk
 * Tanggal      : 29/02/2024
 */

public class Produk {
    private String nama;
    private double harga;
    private int stok;
    private String deskripsi;
    private Penjual seller;

    public Produk (String nama, double harga, int stok, String deskripsi, Penjual seller){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.deskripsi = deskripsi;
        this.seller = seller;
    }

    public void setNama (String nama){
        this.nama = nama;
    }
    
    public void setHarga(double harga){
        this.harga = harga;
    }

    public void setStok (int stok){
        this.stok = stok;
    }

    public void setDeskripsi(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public void setPenjual(Penjual seller){
        this.seller = seller;
    }

    public String getNama(){
        return this.nama;
    }

    public double getHarga(){
        return this.harga;
    }

    public int getStok(){
        return this.stok;
    }

    public String getDeskripsi(){
        return this.deskripsi;
    }

    public Penjual getPenjual(){
        return this.seller;
    }
}
