package ru.ayupov.task01;

import java.util.Scanner;

/**
 * Домашнее задание №4
 * Програма №1
 *
 * @author Фирзар Аюпов
 * <p>
 * Написать программу для поиска минимального из двух чисел.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа поиска минимального числа из двух чисел");
        System.out.println("Введите первое число:");
        Scanner scn = new Scanner(System.in);
        int numOne = scn.nextInt();
        System.out.println("Введите второе число:");
        int numTwo = scn.nextInt();
        if (numOne != numTwo) {
            int minNum = Math.min(numOne, numTwo);
            System.out.println("Минимальное число: " + minNum);
        } else {
            System.out.println("Числа равны!");
        }
    }
}
