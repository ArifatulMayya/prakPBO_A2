/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pertemuan7;

/**
 * Nama     : Arifatul Mayya Kholidha
 * NIM      : 24060122120003
 * Tanggal  : 01 Mei 2024
 * Deskripsi : File Main
 * @author LENOVO
 */
public class Lat_Medium {
    public static void main(String[] args) {
       Senjata ak47 = new Senjata("TAR");
       Senjata m16 = new Senjata("DOR");
       KontrolSenjata kontrolAK47 = new KontrolSenjata(ak47);
       KontrolSenjata kontrolM16 = new KontrolSenjata(m16);
       
       kontrolAK47.menembak(2);
       kontrolAK47.isiPeluru(3);
       kontrolAK47.menembak(5);
       
       System.out.println("===============================");
       
       kontrolM16.menembak(1);
       kontrolM16.isiPeluru(5);
       kontrolM16.menembak(2);
    }
    
}
