/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanveryeasy;

/**
 * Nama     : Arifatul Mayya Kholidha
 * NIM      : 24060122120003
 * Tanggal  : 02 Mei 2024
 * Deskripsi : File Class
 * @author LENOVO
 */
public class Senjata {
    private String bunyi;
    private boolean menembak;
    private int peluru;

    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }
    
    public void menembak(){
        System.out.println(this.getBunyi());
        this.setPeluru(getPeluru()-1);
        System.out.println("Sisa Peluru: " + this.getPeluru());
    }
}

