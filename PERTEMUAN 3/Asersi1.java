/*
 * File         : Asersi1.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Asersi1
 * Tanggal      : 04/03/2024
 */

public class Asersi1{
    public static void main(String[] args) {
        int x=0;
        if (x>0){
            System.out.println("x bilangan positif");
        }
        else{
            assert(x<0):"ada kesalaham kode";
            System.out.println("x bilangan negatif");
        }
    }
}