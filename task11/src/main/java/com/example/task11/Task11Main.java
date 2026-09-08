package com.example.task11;

public class Task11Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = {7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
         */
    }

    static void swap(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int min = Integer.MAX_VALUE;
        int c = 0;
        int ind = -1;
        for (int i : arr) {
            if (min >= i) {
                min = i;
                ind = c;
            }
            c++;
        }
        arr[ind] = arr[0];
        arr[0] = min;
    }

}