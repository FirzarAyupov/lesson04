package ru.ayupov.task02;

import java.util.Scanner;

/**
 * Домашнее задание №4
 * Програма №2
 *
 * @author Фирзар Аюпов
 * <p>
 * Написать программу, которая описывает введенное число.
 * Отрицательное оно число или положительное (или нулевое), чётное или нечётное.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа описания введенного числа");
        System.out.println("Введите число:");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        System.out.print("Введенное число " + num + ": ");

        if (num == 0) {
            System.out.print("нулевое");
        } else {
            if (num > 0) {
                System.out.print("положительное");
            } else {
                System.out.print("отрицательное");
            }

            if (num % 2 == 0) {
                System.out.print(", четное");
            } else {
                System.out.print(", нечетное");
            }
        }
    }
}
