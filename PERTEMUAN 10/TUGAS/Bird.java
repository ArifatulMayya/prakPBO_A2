/** File        : Bird.java 
 * Penulis      : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : File Class Bird
 * Tanggal      : 26/05/2024 */


class Bird extends Animal implements IFlyer {
    public void takeOff() {
        System.out.println("Flapping wings to take off.");
    }

    public void land() {
        System.out.println("Landing smoothly.");
    }

    public void fly() {
        System.out.println("Flying high.");
    }

    public void eat() {
        System.out.println("Eating seeds.");
    }
}