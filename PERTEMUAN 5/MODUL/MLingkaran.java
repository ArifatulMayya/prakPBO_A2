/** File        : MLingkaran.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : implementasi cara menghitung luas lingkaran
 * Tanggal      : 18/03/2024 */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan panjang jejari : ");
        double jejari = scanner.nextDouble();

        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());

        scanner.close();
    }
}
