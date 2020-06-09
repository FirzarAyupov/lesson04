package ru.ayupov.task03;

import java.util.Scanner;

/**
 * Домашнее задание №4
 * Программа №3
 *
 * @author Фирзар Аюпов
 * <p>
 * Написать программу для вывода на экран таблицы умножения.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа вывода на экран таблицы умножения");

        System.out.println("Введите размер таблицы по вертикали (положительное целое число):");
        Scanner scn = new Scanner(System.in);
        int tableHeight = scn.nextInt();

        System.out.println("Введите размер таблицы по горизонтали (положительное целое число):");
        int tableWidth = scn.nextInt();

        if (tableHeight > 0 && tableWidth > 0) {
            for (int i = 1; i < tableHeight + 1; i++) {
                for (int k = 1; k < tableWidth + 1; k++) {
                    System.out.printf("%3d", (k * i));
                }
                System.out.println("");
            }
        } else {
            System.out.println("Введенные размеры таблицы не соответствуют требованиям");
        }


    }
}
