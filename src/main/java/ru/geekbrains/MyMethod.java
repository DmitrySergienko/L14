package ru.geekbrains;

import java.util.Arrays;

public class MyMethod {
    static final int SIZE = 10;

    public static void main(String[] args) {
//Рандомные массивы чисел для отладки метода
       int[] initialArray;
       initialArray = new int[SIZE];
       for (int i = 0; i < initialArray.length; i++) {
           initialArray[i] = (int) (Math.random() * SIZE);
       }
//Задание №1 Метод возвращеющий значения после последней 4-ки
        updArr(initialArray);
    }
    public static int[] updArr(int[] arr) {
        int temp = -1;

//Проверяю: есть ли цифра 4 в массиве, и если есть, то присваиваю ее индекс переменной temp
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) {
                temp = i;
            }
        }
        if (temp > 0) {
//Копирую массив от индекса с 4 до конца всех элементов в новый массив newArray

            return Arrays.copyOfRange(arr, temp + 1, arr.length);

        } else {
            throw new RuntimeException("Нет 4 в массиве!");
        }
    }
}
