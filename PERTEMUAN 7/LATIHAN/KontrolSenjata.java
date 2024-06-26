/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan7;

/**
 * Nama     : Arifatul Mayya Kholidha
 * NIM      : 24060122120003
 * Tanggal  : 01 Mei 2024
 * Deskripsi : File Class
 * 
 * @author LENOVO
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata senjata) {
        this.senjata = senjata;
    }
    
    public boolean isAdaPeluru() {
        if (this.senjata.getPeluru() <= 0) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public void isiPeluru(int jumPeluru) {
        this.senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumPeluru);
    }
    
    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (this.senjata.getPeluru() == 0) {
            System.out.println("Peluru Habis");
        }
        else {
            for(int i = 0; i < jumlah; i++) {
                if (this.senjata.getPeluru() > 0) {
                    System.out.println(this.senjata.getBunyi());
                    this.senjata.setPeluru(this.senjata.getPeluru()-1);
                }
                else {
                    System.out.println("Gagal tembak, Peluru habis");
                }
            }
            System.out.println(">> Peluru sisa: " + this.senjata.getPeluru());
        }
    }
}
