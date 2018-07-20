package com.itacademy.zakharenkov.task2;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Created by Roman Zakharenkov on 16.07.2018.
 *
 * It-academy.
 * Lesson 4. Homework 4.
 * Task 2.
 *
 * Написать программу, удаляющую все повторяющиеся целые
    числа из массива и печатающую результат.
 *
 */
public class Task2 {

    public static void main(String[] args) {
        int[] firstArray = inputArrayElements();
        int[] secondArray = Arrays.copyOf(firstArray, firstArray.length);

        deleteDuplicateArrayElementsFirstApproach(firstArray);
        System.out.println(Arrays.toString(firstArray));

        deleteDuplicateArrayElementsSecondApproach(secondArray);
        System.out.println(Arrays.toString(secondArray));
    }

    public static void deleteDuplicateArrayElementsFirstApproach(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean hasDuplicate = false;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    array[j] = 0;
                    hasDuplicate = true;
                }
                if (hasDuplicate) {
                    array[i] = 0;
                }
            }
        }
    }

    public static void deleteDuplicateArrayElementsSecondApproach(int[] array) {
        Arrays.sort(array);
        boolean hasDuplicate = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                array[i] = 0;
                hasDuplicate = true;
            } else if (hasDuplicate) {
                array[i] = 0;
                hasDuplicate = false;
            }
        }
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
}
