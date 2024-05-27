/** File        : Animal.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Class Animal
 * Tanggal      : 26/05/2024 */

abstract class Animal {
    abstract void eat();
    public String toString() {
        return this.getClass().getSimpleName();
    }
}