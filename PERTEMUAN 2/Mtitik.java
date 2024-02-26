/*
 * File         : Mtitik.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Main Program Titik
 * Tanggal      : 19/02/2024
 */

public class Mtitik {
        public static void main(String[] args){
            Titik t1, t2, t3;
            t1 = new Titik(); t1.setAbsis(1); t1.setOrdinat(2); 

            t2 = new Titik(3.0, 4.0); //untuk double

            t3 = new Titik(5,7); //overloading untuk integer
            
            System.out.println("Jumlah objek titik : "+t3.getCounterTitik());
            System.out.println("t1(" + t1.getAbsis() +", " + t1.getOrdinat()+ ")");
            System.out.println("t2(" + t2.getAbsis() +", " + t2.getOrdinat()+ ")");
            System.out.println("t3(" + t3.getAbsis() +", " + t3.getOrdinat()+ ")");
        }
    }
    
