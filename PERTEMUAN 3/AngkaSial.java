/*
 * File         : AngkaSial.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Program Angka Sial
 * Tanggal      : 04/03/2024
 */

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch (AngkaSialException ase) {
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka !!!");
        }
    }
}

// 1. Ketika eksepsi terjadi, yaitu saat `as.cobaAngka(13);` dipanggil, baris 12 pada `AngkaSial.java` tidak akan dieksekusi.
// Hal ini disebabkan oleh melemparkan eksepsi `AngkaSialException` pada kondisi `if(angka==13)`, sehingga eksekusi langsung beralih ke blok `catch` untuk menangani eksepsi tersebut.
// 2. Baris 21 pada `AngkaSial.java` akan dieksekusi setelah eksekusi blok `try` selesai. 
// Jika tidak ada eksepsi yang dilemparkan selama eksekusi blok `try`, maka baris 21 akan dieksekusi setelah semua pemanggilan `as.cobaAngka()` selesai dieksekusi. 
// Namun, jika terjadi eksepsi dan ditangkap oleh blok `catch`, baris 21 akan dieksekusi setelah blok `catch` tersebut. Dalam konteks kode yang diberikan, 
// baris 21 akan dieksekusi setelah eksekusi blok `try` dan blok `catch` selesai, karena tidak ada eksepsi yang tidak tertangkap dan program melanjutkan eksekusi normalnya.