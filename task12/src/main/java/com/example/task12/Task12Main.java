package com.example.task12;

public class Task12Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void selectionSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int p = 0; p < arr.length; p++) {
            int min = Integer.MAX_VALUE;
            int ind = -1;
            for (int i = p; i < arr.length; i++) {
                if (min >= arr[i]) {
                    min = arr[i];
                    ind = i;
                }
            }
            arr[ind] = arr[p];
            arr[p] = min;
        }
    }

}