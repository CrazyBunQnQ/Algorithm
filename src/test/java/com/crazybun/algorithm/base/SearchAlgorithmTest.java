package com.crazybun.algorithm.base;

import org.junit.Test;

import java.util.Arrays;

/**
 * 搜索查找算法测试
 *
 * @version 2018/12/12.
 * @auther CrazyBunQnQ
 */
public class SearchAlgorithmTest {
    /**
     * 二分搜索算法测试
     */
    @Test
    public void binarySearchTest() {
        Integer[] arr = TestUtil.generateOrderedArrayWithoutDuplicates(10, 5, 20);
        System.out.println(Arrays.toString(arr));
        System.out.println(Search.binarySearch(arr, 10, 9));
    }
}
