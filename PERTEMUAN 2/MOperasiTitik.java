
/*
 * File         : MOperasi.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Main Operasi Titik
 * Tanggal      : 26/02/2024
 */

 public class MOperasiTitik {

    public static void main(String[] args){
        Titik t = new Titik(4,4);
        OperasiTitik o = new OperasiTitik();
        

        System.out.println("Titik : (" + t.getAbsis() + ", " + t.getOrdinat() + ")" ) ;
        o.refleksiX(t);
        System.out.println("Titik : (" + t.getAbsis() + ", " + t.getOrdinat() + ")" ) ;
        o.refleksiY(t);
        System.out.println("Titik : (" + t.getAbsis() + ", " + t.getOrdinat() + ")" ) ;
    }
}

