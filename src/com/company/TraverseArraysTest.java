package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class TraverseArraysTest {

    @Test
    public void countEvenTest() {
        int[] numbers = {2, 1, 2, 3, 4};
        int[] numbers2 = {2, 2, 0};
        int[] numbers3 = {1, 3, 5};
        assertEquals(3, TraverseArrays.countEven(numbers));
        assertEquals(3, TraverseArrays.countEven(numbers2));
        assertEquals(0, TraverseArrays.countEven(numbers3));
    }

    @Test
    public void buildArrayTest() {

        assertArrayEquals(new int[]{0, 1, 2, 3}, TraverseArrays.buildArray(4));
        assertArrayEquals(new int[]{0}, TraverseArrays.buildArray(1));
        assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, TraverseArrays.buildArray(10));
    }

    @Test
    public void sum28Test() {
        assertEquals(true, TraverseArrays.sum28(new int[]{2, 3, 2, 2, 4, 2}));
        assertEquals(false, TraverseArrays.sum28(new int[]{2, 3, 2, 2, 4, 2, 2}));
        assertEquals(false, TraverseArrays.sum28(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void zeroMax() {
        assertArrayEquals(new int[]{5, 5, 3, 3}, TraverseArrays.zeroMax(new int[]{0, 5, 0, 3}));
    }

    @Test
    public void selfDivisor() {
        assertArrayEquals(new int[]{11, 12, 15}, SelfDivisor.firstNumSelfDivisors(10, 3));
        assertArrayEquals(new int[]{22, 24, 33, 36, 44}, SelfDivisor.firstNumSelfDivisors(22, 5));
    }
}