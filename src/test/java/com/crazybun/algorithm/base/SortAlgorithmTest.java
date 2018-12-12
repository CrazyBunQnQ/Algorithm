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
        Integer[] arr = TestUtil.generateRandomArray(10, 5, 50);
        System.out.println(Arrays.toString(arr));
        Sort.selectionSort(arr, 10);
        System.out.println(Arrays.toString(arr));
    }
}
