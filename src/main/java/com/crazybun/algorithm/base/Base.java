package com.crazybun.algorithm.base;

/**
 * 基础算法
 *
 * @author CrazyBunQnQ
 * @date 2018/12/12.
 */
public class Base {
    private final static int TWO = 2;

    private Base() {}

    /**
     * 交换数组中的两个对象 i 和 j
     * <p>
     * O(1)
     *
     * @param arr 原数组
     */
    public static void swap(Object[] arr, int i, int j) {
        if (i < 0 || i >= arr.length) {
            throw new IllegalArgumentException("i is out of bound.");
        }
        if (j < 0 || j >= arr.length) {
            throw new IllegalArgumentException("j is out of bound.");
        }
        Object temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 翻转数组
     * <p>
     * O(n/2)
     *
     * @param arr
     */
    public static void reverse(Object[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / TWO; i++) {
            swap(arr, i, n - 1 - i);
        }
    }

    /**
     * 判断数字 num 是否是素数
     */
    public static boolean isPrime2(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == TWO) {
            return true;
        }
        if (num % TWO == 0) {
            return false;
        }

        for (int x = 3; x * x <= num; x += TWO) {
            if (num % x == 0) {
                return false;
            }
        }
        return true;
    }

}
