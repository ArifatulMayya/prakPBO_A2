/*
 * File         : Asersi2.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Asersi2
 * Tanggal      : 04/03/2024
 */

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2{
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!";
        Lingkaran l  = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran =" + kelilingLingkaran);
    }
}

// Dalam program Asersi2 yang diberikan, terdapat kesalahan konseptual terkait penggunaan asersi. 
// Asersi digunakan untuk memeriksa kondisi tertentu yang harus dipenuhi sebelum program melanjutkan eksekusi. Namun, pada program ini, asersi yang dimaksudkan untuk memastikan bahwa nilai jari-jari tidak boleh nol ditempatkan setelah nilai jari-jari dideklarasikan dan diinisialisasi dengan nilai 0. Hal ini menyebabkan asersi tidak akan pernah dipicu karena nilai jari-jari selalu nol saat diperiksa.
// Penggunaan asersi yang tepat harus memastikan kondisi yang diinginkan terpenuhi sebelum eksekusi program dilanjutkan. 
// Oleh karena itu, sebaiknya asersi diletakkan di awal program atau di tempat yang sesuai, sebelum variabel yang diperiksa digunakan. 
// Dengan demikian, program akan memberikan pesan kesalahan jika kondisi yang tidak diinginkan terpenuhi sebelum eksekusi program dilanjutkan. 
// Dalam konteks program ini, asersi seharusnya diletakkan sebelum objek Lingkaran dibuat, sehingga memastikan bahwa nilai jari-jari tidak nol sebelum operasi perhitungan keliling lingkaran dilakukan.