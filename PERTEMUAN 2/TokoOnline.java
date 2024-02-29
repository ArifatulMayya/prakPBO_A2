/*
 * File         : TokoOnline.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Program TokoOnline
 * Tanggal      : 29/02/2024
 */

public class TokoOnline {
    public static void main(String[] args) {
        Penjual penjual1;
        Produk produk1;

        penjual1 = new Penjual("Yanto", "Jalan Mawar", "0622343976");
        produk1 = new Produk ("Televisi", 2500000, 10, "Samsung LED 4K", penjual1);

        System.out.println("\nDetail Penjual");
        System.out.println("Nama \t  : " + penjual1.getNama());
        System.out.println("Alamat \t  : " + penjual1.getAlamat());
        System.out.println("NoTelp \t  : " + penjual1.getNoTelp() + "\n");
        
        System.out.println("Detail Produk");
        System.out.println("Nama \t  : " + produk1.getNama());
        System.out.println("Harga \t  : " + produk1.getHarga());
        System.out.println("Stok \t  : " + produk1.getStok());
        System.out.println("Deskripsi : " + produk1.getDeskripsi()); 
        System.out.println("Penjual   : " + penjual1.getNama() + "\n");  

        System.out.println("Penjual " + produk1.getNama() + " : " + produk1.getPenjual().getNama());
    }
}
