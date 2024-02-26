/*
 * File         : Titik.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Kelas Titik
 * Tanggal      : 19/02/2024
 */

public class Titik {
private double absis;
private double ordinat;
static int counterTitik;
static int jarakPusat;
        
        public Titik(){
                this(0,0);
        }
        
        
        // OVERLOADING KONSTRUKTOR 
        public Titik(int x, int y){
                this.absis = x;
                this.ordinat = y;
                counterTitik++;
        }
        
        void setAbsis(double x) {
                this.absis = x;
        }
        
        void setOrdinat(double y){
                this.ordinat = y;
        }
        
        double getAbsis(){
                return this.absis;
        }
        
        double getOrdinat(){
                return this.ordinat;
        }
        
        int getCounterTitik(){
                return counterTitik;
        }
    }
    
