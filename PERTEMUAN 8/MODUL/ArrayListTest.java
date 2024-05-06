/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.pertemuan8;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
       ArrayList<String> strings = new ArrayList<String>();
       
       strings.add("Praktikum");
       strings.add("collection");
       strings.add("Dan generics");
       
       strings.remove("praktikum");
       
       for(String s : strings) {
           System.out.println(s+" ");
       }
    }
    
}
