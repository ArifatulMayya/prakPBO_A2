/** File        : MPoligon.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : Driver class untuk poligon dari persegi panjang dan segitiga
 * Tanggal      : 11/03/2024 */

package org.main;

import org.bangundatar.*;
public class MPoligon {
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10,10,4);
        Segitiga segitiga = new Segitiga(7, 9, 3);

        System.out.println("\n");
        persegi.printInfo();
        System.out.println("Luas Persegi Panjang : " +persegi.hitungLuas() +"\n");
        
        segitiga.printInfo();
        System.out.println("Luas Seigitiga : " +segitiga.hitungLuas() + "\n");
    }
    
}
