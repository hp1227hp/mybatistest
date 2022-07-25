package com.example.test;

import java.util.Arrays;

public class QuickSortClient {

    static int[] array1 = {3, 5, 1, -2, 8, 9, 5};

    /**
     * 快速排序，使用递归方式
     *
     * @param array
     * @param left
     * @param right
     */
    public static void quickSort(int[] array, int left, int right) {
        if (array == null || array.length <= 0) {
            return;
        }
        if (left >= right) {
            return;
        }
        int key = array[left];
        int l = left;
        int r = right;
        while (l < r) {
            while (array[r] > key) {
                r--;
            }
            while (array[l] <= key && l < r) {
                l++;
            }
            if (l < r) {
                int temp = array[r];
                array[r] = array[l];
                array[l] = temp;
            }
        }
        array[left] = array[l];
        array[l] = key;
        quickSort(array, left, l - 1);
        quickSort(array, r + 1, right);
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array1));
        QuickSortClient.quickSort(array1, 0, array1.length - 1);
        System.out.println("------------");
        System.out.println(Arrays.toString(array1));
    }

}
