/* 
 * Nama File    : LambdaMap.java
 * Nama Pembuat : Arifatul Mayya Kholidha
 * NIM          : 24060122120003
 * Deskripsi    : Implementasi lambda pada Map, digunakan sebagai parameter pada method.
 * Tanggal      : 30 Mei 2024
 */


 import java.util.*;

 public class LambdaMap {
     public static void main(String[] args) {
         Map<String, String> mahasiswaMap = new HashMap<>();
         mahasiswaMap.put("24060122120071", "Peter Parker");
         mahasiswaMap.put("24060122145670", "Doctor Strange");
         mahasiswaMap.put("24060122134567", "Gwen Stacy");
 
         mahasiswaMap.forEach((nim,nama) -> {
             System.out.println(nim + " : " + nama);
         });
     }
 }