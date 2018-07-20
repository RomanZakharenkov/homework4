package com.itacademy.zakharenkov.task1;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Created by Roman Zakharenkov on 16.07.2018.
 *
 * It-academy.
 * Lesson 4. Homework 4.
 * Task 1.
 *
 * Напишите программу, которая циклически сдвигает элементы
    массива вправо на одну позицию, и печатает результат.
    Цикличность означает, что последний элемент массива становится
    самым первым его элементом.
 */
public class Task1 {

    public static void main(String[] args) {
        int[] nums = inputArrayElements();
        shiftArrayElements(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] inputArrayElements() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите кол-во элементов массива:");
        int size = scanner.nextInt();

        int[] nums = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }

        return nums;
    }

    public static void shiftArrayElements(int[] array) {
        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }

        array[0] = last;
    }
}
