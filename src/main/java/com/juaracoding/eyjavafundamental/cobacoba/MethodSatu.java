package com.juaracoding.eyjavafundamental.cobacoba;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 28/06/2023 20:52
@Last Modified 28/06/2023 20:52
Version 1.0
*/
public class MethodSatu {
    public static void main(String[] args){
    System.out.println(intRumusPersegi(35*5));
    System.out.println(doRumusLayangLayang(7.8,2.7));

//        hitung luas persegi
//        hitung luas layanglayang
    }

//    methodnya
    public static int intRumusPersegi(int intSisi)
    {
        int intRumusPersegi = intSisi*intSisi;
        return intRumusPersegi;
    }


        public static double doRumusLayangLayang ( double doDiagonal1, double doDiagonal2)
        {
            double doRumusLayangLayang = (doDiagonal1*doDiagonal2)/2;
            return doRumusLayangLayang;

        }

}
