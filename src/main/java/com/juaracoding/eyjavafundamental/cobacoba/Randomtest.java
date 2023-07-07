package com.juaracoding.eyjavafundamental.cobacoba;

import java.util.Random;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 30/06/2023 21:00
@Last Modified 30/06/2023 21:00
Version 1.0
*/
public class Randomtest {

    public static void main(String[] args) {
        Random random = new Random();
//        int intNilaiRandom = 0;
//        char chData = 'a';
//        for (int i=0;i<10;i++)
//        {
//            intNilaiRandom = random.nextInt(97,123);
//            chData = (char)intNilaiRandom;
//            System.out.println("Print -> i ke "+i+" Nilai Random nya "+chData);
//        }
        //Buatlah 10 data dengan mekanisme Random dengan Format
        // Huruf awal [A-Z] , sisa nya [a-z] interval length 10-15
        // Format Email
        // [a-z] interval length 8 - 20 , @ , provider (gmail,yahoo,dll) , domain(com,co.id,id)

        String strProvider [] = {"gmail","yahoo","rocketmail","banyak"};
        String strDomain [] = {".id",".co.id",".com"};

        String strData = "";
        int intRandomLengthBegin = 10;
        int intRandomLengthEnd = 16;
        int intRandomKapitalAwal = 65;
        int intRandomKapitalAkhir = 91;
        int intRandomCharAwal = 97;
        int intRandomCharAkhir = 123;
        char chHurufBesar = 'a';
        char chHurufKecil = 'a';
        String strTampung = "";
        int intRandomLengthz = random.nextInt(intRandomLengthBegin,intRandomLengthEnd);
        for(int j=0;j<10;j++)
        {
            strTampung = "";
            intRandomLengthz = random.nextInt(intRandomLengthBegin,intRandomLengthEnd);
            for(int i=0;i<intRandomLengthz;i++)
            {
                if(i==0)
                {
                    chHurufBesar = (char) random.nextInt(intRandomKapitalAwal,intRandomKapitalAkhir);
                    strTampung = strTampung + chHurufBesar;
                }
                else
                {
                    chHurufKecil = (char) random.nextInt(intRandomCharAwal,intRandomCharAkhir);
                    strTampung = strTampung + chHurufKecil;
                }
            }
            System.out.println("String Format adalah "+strTampung);
        }
    }
}
