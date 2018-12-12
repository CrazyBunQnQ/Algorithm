package com.crazybun.algorithm.base;

/**
 * 常用排序算法
 *
 * @version 2018/12/12.
 * @auther CrazyBunQnQ
 */
public class Sort {
    private Sort() {}

    /**
     * 通过选择排序将数组 arr 中前 n 个元素从小到大排序
     * <p>
     * 首先在未排序序列中找到最小元素，存放到排序序列的起始位置，然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。以此类推，直到所有元素均排序完毕。
     * <p>
     * O(n^2)
     *
     * @param arr 待排序数组
     * @param n   参与排序元素个数，前 n 个
     */
    public static void selectionSort(Comparable[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            //在未排序元素中找最小元素并将下标赋值给 minIndex
            for (int j = i + 1; j < n; j++)
                if (arr[j].compareTo(arr[minIndex]) < 0)
                    minIndex = j;
            //交换未排序元素中的首个元素与最小元素位置
            Base.swap(arr, i, minIndex);
        }
    }
}
