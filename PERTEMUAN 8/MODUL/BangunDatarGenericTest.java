/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pertemuan8;

/**
 *
 * @author LENOVO
 */
public class BangunDatarGenericTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2) ;
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling lingkaran : " +bdg.hitungKeliling());
        System.out.println("Tipe Generic : " +bdg.get().getClass().getName());
                        
    }
    
}
