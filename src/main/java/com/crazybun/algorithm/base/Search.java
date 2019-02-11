package com.crazybun.algorithm.base;

/**
 * 常用搜索、查找算法
 *
 * @author CrazyBunQnQ
 * @date 2018/12/12.
 */
public class Search {
    private Search() {}

    /**
     * 二分搜索：在有序数组中查找某一特定元素的位置
     * <p>
     * 从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜索过程结束；如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。如果在某一步骤数组为空，则代表找不到。这种搜索算法每一次比较都使搜索范围缩小一半。
     * <p>
     * O(logn) Time Complexity
     *
     * @param arr    <b>有序</b>数组
     * @param n      在前 n 个元素中搜索
     * @param target 搜索元素
     *
     * @return 搜索元素的位置
     */
    public static int binarySearch(Comparable[] arr, int n, int target) {
        int l = 0, r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid].compareTo(target) == 0) {
                return mid;
            }
            if (arr[mid].compareTo(target) > 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
