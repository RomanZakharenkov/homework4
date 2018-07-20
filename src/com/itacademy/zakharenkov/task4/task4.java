package com.itacademy.zakharenkov.task4;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Created by Roman Zakharenkov  on 19.07.2018.
 *
 * It-academy.
 * Lesson 4. Homework 4.
 * Task 4.
 *
 * Написать функцию linearize, которая принимает в качестве
    параметра двумерный массив
    и возвращает одномерный массив со всеми элементами
    двумерного.
 */
public class task4 {

    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 2, 3, 4, 5}, {11, 12, 13}};
        int[] arrayResult = linearize(array);
        System.out.println(Arrays.toString(arrayResult));
    }

    public static int[] linearize(int[][] array) {
        int newArraySize = array[0].length + array[1].length;
        int[] resultArray = new int[newArraySize];

        int index = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                resultArray[index++] = array[i][j];
            }
        }

        return resultArray;
    }
}
