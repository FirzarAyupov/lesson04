package ru.ayupov.task04;

import java.util.Scanner;

/**
 * Домашнее задание №4.
 * Программа №4
 *
 * @author Фирзар Аюпов
 * <p>
 * Написать программу, которая выводит арифметическую или геометрическую прогрессию для N чисел.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Программа вывода вывода прогрессии");
        Scanner scn = new Scanner(System.in);

        System.out.println("Введите номер прогрессии которую хотите вывести:");
        System.out.println("1. Арифметическая прогрессия.");
        System.out.println("2. Геометрическая прогрессия.");
        int progressionType = scn.nextInt();

        System.out.println("Введите шаг/знаменатель прогрессии");
        int progressionStep = scn.nextInt();

        System.out.println("Введите размерность прогрессии");
        int progressionSize = scn.nextInt();

        switch (progressionType) {
            case 1:
                System.out.println("Выбрана арифметическая прогрессия");
                printArithmeticalProgression(progressionStep, progressionSize);
                break;
            case 2:
                System.out.println("Выбрана геометрическая прогрессия");
                printGeometricProgression(progressionStep, progressionSize);
                break;
        }

    }

    static void printArithmeticalProgression(int step, int size) {
        int startNum = 1;
        for (int i = 0; i != size; i++) {
            System.out.print(startNum + " ");
            startNum += step;
        }
    }

    static void printGeometricProgression(int step, int size) {
        if (step > 0) {
            int startNum = 1;
            for (int i = 0; i != size; i++) {
                System.out.print(startNum + " ");
                startNum *= step;
            }
        } else {
            System.out.println("Для вывода геомтрической прогрессии знаменатель должен быть больше 0");
        }

    }
}
