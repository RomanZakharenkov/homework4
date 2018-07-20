package com.itacademy.zakharenkov.task3;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Created by Roman Zakharenkov on 16.07.2018.
 *
 * It-academy.
 * Lesson 4. Homework 4.
 * Task 3.
 *
 * Заданы 2 массива целых чисел произвольной длины.
    Написать программу, создающую третий массив,
    представляющий собой слияние 2-х заданных.
 */
public class Task3 {

    public static void main(String[] args) {
        int[] arrayFirst = inputArrayElements();
        int[] arraySecond = inputArrayElements();
        int[] arrayResult = mergeElementsTwoArrays(arrayFirst, arraySecond);
        System.out.println(Arrays.toString(arrayResult));
    }

    public static int[] mergeElementsTwoArrays(int[] arrayFirst, int[] arraySecond) {
        int[] arrayResult = new int[arrayFirst.length + arraySecond.length];
        int index = 0;
        for (int i = 0; i < Math.max(arrayFirst.length, arraySecond.length); i++) {
            if (i < arrayFirst.length) {
                arrayResult[index++] = arrayFirst[i];
            }
            if (i < arraySecond.length) {
                arrayResult[index++] = arraySecond[i];
            }
        }
        return arrayResult;
    }

    public static int[] inputArrayElements() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во элементов массива:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }
}
