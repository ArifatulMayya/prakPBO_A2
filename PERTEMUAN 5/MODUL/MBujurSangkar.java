/** File        : MBujurSangkar.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 * Tanggal      : 18/03/2024 */

import java.util.Scanner;

class MBujurSangkar{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.println("Masukkan sisi bujur sangkar :");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi "+sisi+
                            " satuan adalah "+bs.hitungLuas(sisi));
        
    }
}


// Dalam bahasa Java, ketika sebuah kelas turunan (subclass) mengimplementasikan sebuah kelas induk (superclass) yang memiliki metode abstrak, 
// kelas turunan tersebut **harus** memberikan implementasi konkret untuk semua metode abstrak yang ada di kelas induknya. 
// Jika tidak, akan terjadi kesalahan kompilasi. Oleh karena itu, kelas `BujurSangkar` harus memberikan implementasi untuk semua metode abstrak 
// yang dideklarasikan di kelas `BangunDatar`.