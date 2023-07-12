package com.juaracoding.eyjavafundamental.cobacoba;

import java.util.Scanner;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 10/07/2023 12:10
@Last Modified 10/07/2023 12:10
Version 1.0
*/
public class LatihanException1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intInputan; //untuk input angka integer
        double doInputan; //untuk input angka double

        try{
            while (true){
                System.out.println("Masukkan Bilangan Bulat : ");
                intInputan = scanner.nextInt();
            }
        }catch(Exception e){
            System.out.println("Bilangannya bukan bilangan bulat!!");
        }


    }
}


