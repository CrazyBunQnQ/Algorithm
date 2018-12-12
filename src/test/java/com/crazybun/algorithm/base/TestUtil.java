package com.crazybun.algorithm.base;

import java.util.HashSet;
import java.util.Set;

/**
 * @version 2018/12/12.
 * @auther CrazyBunQnQ
 */
public class TestUtil {
    private TestUtil() {}

    /**
     * 随机生成元素为 rangeL ~ rangeR 的整数数组
     *
     * @param n      生成数组的元素个数
     * @param rangeL 最小元素范围
     * @param rangeR 最大元素范围
     *
     * @return 随机整数数组
     */
    public static Integer[] generateRandomArray(int n, int rangeL, int rangeR) {
        assert n > 0 && rangeL <= rangeR : "元素个数必须大于零并且范围 L 要小于等于范围 R";
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++)
            arr[i] = (int) (Math.random() * (rangeR - rangeL + 1)) + rangeL;
        return arr;
    }

    /**
     * 随机生成元素为 rangeL ~ rangeR 且没有重复元素的整数数组
     *
     * @param n      生成数组的元素个数
     * @param rangeL 最小元素范围
     * @param rangeR 最大元素范围
     *
     * @return 随机整数数组
     */
    public static Integer[] generateRandomArrayWithoutDuplicates(int n, int rangeL, int rangeR) {
        assert n > 0 && rangeL <= rangeR && rangeR - rangeL > n : "元素个数必须大于零并且范围 L 要小于等于范围 R 并且最大元素 R 减去最小元素 L 必须大于 n";
        Integer[] arr = new Integer[n];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; ) {
            Integer e = (int) (Math.random() * (rangeR - rangeL + 1)) + rangeL;
            if (set.add(e)) {
                arr[i] = e;
                i++;
            }
        }
        return arr;
    }

    /**
     * 随机生成元素为 rangeL ~ rangeR 的有序整数数组
     *
     * @param n      生成数组的元素个数
     * @param rangeL 最小元素范围
     * @param rangeR 最大元素范围
     *
     * @return
     */
    public static Integer[] generateOrderedArray(int n, int rangeL, int rangeR) {
        Integer[] arr = generateRandomArray(n, rangeL, rangeR);
        Sort.selectionSort(arr, n);
        return arr;
    }

    /**
     * 随机生成元素为 rangeL ~ rangeR 且没有重复元素的有序整数数组
     *
     * @param n      生成数组的元素个数
     * @param rangeL 最小元素范围
     * @param rangeR 最大元素范围
     *
     * @return
     */
    public static Integer[] generateOrderedArrayWithoutDuplicates(int n, int rangeL, int rangeR) {
        Integer[] arr = generateRandomArrayWithoutDuplicates(n, rangeL, rangeR);
        Sort.selectionSort(arr, n);
        return arr;
    }
}
