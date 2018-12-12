package com.crazybun.algorithm.base;

import org.junit.Test;

/**
 * @version 2018/12/12.
 * @auther CrazyBunQnQ
 */
public class BaseAlgorithmTest {
    @Test
    public void test() {
        if (Base.isPrime2(137)) System.out.println("137 is a prime.");
        else System.out.println("137 is not a prime.");

        if (Base.isPrime2(121)) System.out.println("121 is a prime.");
        else System.out.println("121 is not a prime.");
    }
}
