package com.juaracoding.eyjavafundamental.testharian.praktikum1.praktikum3;

/*IntelliJ IDEA 2023.1.2 (Community Edition)
Build #IC-231.9011.34, built on May 16, 2023
@Author Enrico a.k.a. Enrico Yohanes
Java Developer
Created on 07/07/2023 15:56
@Last Modified 07/07/2023 16:08
Version 1.0
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Masukkan angka :");

        try {
            while (true) {
                int number = scanner.nextInt();
                numbers.add(number);
            }
        } catch (InputMismatchException e) {
            // Mengabaikan pengecualian InputMismatchException dan melanjutkan ke perhitungan rata-rata
        }

        double average = calculateAverage(numbers);

        System.out.println("User melakukan input data sebanyak " + numbers.size() + " kali");
        System.out.print("Dengan data input: ");
        printNumbers(numbers);
        System.out.println("Rata-rata: " + average);

        scanner.close();
    }

    private static double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    private static void printNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));
            if (i != numbers.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}
