/*
 * File         : Penjual.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Class Penjual
 * Tanggal      : 29/02/2024
 */

public class Penjual {
    private String nama;
    private String alamat;
    private String noTelp;

    public Penjual(String nama, String alamat, String noTelp) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelp = noTelp;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setNoTelp(String noTelp){
        this.noTelp = noTelp;   
    }

    public String getNama(){
        return this.nama;
    }

    public String getAlamat(){
        return this.alamat;
    }

    public String getNoTelp(){
        return this.noTelp;
    }

}
