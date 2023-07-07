package com.juaracoding.eyjavafundamental.testharian.praktikum1;

import java.util.Scanner;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 26/06/2023 20:03
@Last Modified 26/06/2023 20:03
Version 1.0
*/
public class Praktikum1 {
    //    (Input)		Masukkan Kata : Jquery 1995@v1.0
    //    (Output)	Hasil	: 529

    // (Input) 		Masukkan Kata : Bebas Lepas@
    // (Output)	Hasil	: 238

    // Berapakah output jika kata yang diinput adalah Tid4k $@ma
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String strInput = ""; // PENAMPUNG INPUTAN USER
        int intHasilInputKata = 0; // UNTUK MENGHITUNG HASIL JUMLAH AKHIR
        char chInputKata = 'a'; // UNTUK MENGAMBIL SETIAP KARAKTER PADA INPUTAN USER
        int intConvertKata = 0; // UNTUK MENGHITUNG SETIAP KARAKTER YANG DIINPUT PADA USER

        // STEP 1 INPUT KATA
        System.out.println("Masukkan kata :");
        strInput = scanner.nextLine();

        // STEP 2 MELAKUKAN PERULANGAN SETIAP KARAKTER
        for (int i = 0; i < strInput.length(); i++)

        {
            // STEP 3 MELAKUKAN PENGAMBILAN KARAKTER
            chInputKata = strInput.charAt(i);

            // STEP 4 MENGKONVERSI KARAKTER YANG DIAMBIL
            intConvertKata = chInputKata;

// ANALISA HURUF KAPITAL 65 s.d 90
// ANALISA HURUF KECIL 97 s.d 122
// ANALISA ANGKA 48 s.d 57
// ANALISA SIMBOL . ADALAH 46
// ANALISA SIMBOL @ ADALAH 64

            // STEP 5 MELAKUKAN PENGKODISIAN PADA PROSES CONVERT
            if ((intConvertKata >= 65 && intConvertKata <= 90)||
//                            (intConvertKata >= 97 && intConvertKata <= 122)||
                            (intConvertKata == 32)||
                            (intConvertKata == 46)||
                            (intConvertKata == 64) ||
                            (intConvertKata >= 48 && intConvertKata <= 57))
            {
                // STEP 6 MELAKUKAN PERHITUNGAN DARI PERULANGAN
                intHasilInputKata = intHasilInputKata + intConvertKata;
            }

        }
        // STEP AKHIR MELAKUKAN PROSES CETAK
        System.out.println("Output dari Input :" +strInput+ "Adalah =" + intHasilInputKata);
    }
}