package com.crazybun.algorithm.base;

import org.junit.Test;

import java.util.Arrays;

/**
 * 排序算法测试
 *
 * @version 2018/12/12.
 * @auther CrazyBunQnQ
 */
public class SortAlgorithmTest {
    /**
     * 选择排序测试
     */
    @Test
    public void selectionSortTest() {
        long start, timeCost;
        int n = 10000, rangeL = 1, rangeR = n * 10;
        // 随机生成测试数组
        Integer[] arr = TestUtil.generateRandomArray(n, rangeL, rangeR);
        System.out.println("生成随机数组：" + Arrays.toString(arr));
        Integer[] arr1 = arr.clone();
        start = System.currentTimeMillis();
        Sort.selectionSort(arr1, n);
        timeCost = System.currentTimeMillis() - start;
        System.out.println("选择排序用时 " + timeCost + " 毫秒：");
        Integer[] arr2 = arr.clone();
        start = System.currentTimeMillis();
        Sort.bubbleSort(arr2, n);
        timeCost = System.currentTimeMillis() - start;
        System.out.println("冒泡排序用时 " + timeCost + " 毫秒：");

        if (Arrays.equals(arr1, arr2)) {
            System.out.println(Arrays.toString(arr1));
        }
    }
}
