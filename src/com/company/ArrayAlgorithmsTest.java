package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayAlgorithmsTest {

    @Test
    public void printArray() {
        assertEquals("-2 -9 -6 -8 -9 -3 -1 ", ArrayAlgorithms.printArray(new int[] {-2, -9, -6, -8, -9, -3, -1}));
        assertEquals("1 2 3 4 ", ArrayAlgorithms.printArray(new int[] {1, 2, 3, 4}));
        assertEquals("0 ", ArrayAlgorithms.printArray(new int[] {0}));
        assertEquals("", ArrayAlgorithms.printArray(new int[] {}));
    }

    @Test
    public void checkForAllNegatives() {
        assertTrue(ArrayAlgorithms.checkForAllNegatives(new int[] {-2, -9, -6, -8, -9, -3, -1}));
        assertFalse(ArrayAlgorithms.checkForAllNegatives(new int[] {-2, -9, -6, -8, -9, -3, 0}));

    }

    @Test
    public void hasDupes() {
        assertTrue(ArrayAlgorithms.hasDupes(new int[] {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5}));
        assertFalse(ArrayAlgorithms.hasDupes(new int[] {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 11}));
    }

    @Test
    public void countEvensTest() {
        assertEquals(8, ArrayAlgorithms.countEvens(new int[] {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5}));
        assertEquals(11, ArrayAlgorithms.countEvens(new int[] {12, 3, 72, 16, 47, 46, 92, 12, 18, 36, 76, 51, 99, 101, 42, 42}));
        assertEquals(0, ArrayAlgorithms.countEvens(new int[] {1, 3, 5, 7, 9}));
    }

    @Test
    public void leftShiftTest() {
        assertArrayEquals(new int[] {1, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0},
                ArrayAlgorithms.leftShift(new int[] {1, 0, 1, 1, 0, 1, 0, 1}, 6));
        assertArrayEquals(new int[] {1, 1, 1, 0, 0, 0}, ArrayAlgorithms.leftShift(new int[] {1, 1, 1}, 3));
    }

    @Test
    public void reverseArrayTest() {
        assertEquals("2 5 0 3 4 1 8 9 4 7 5 ", ArrayAlgorithms.reverseArray(new int[] {5, 7, 4, 9, 8, 1, 4, 3, 0, 5, 2}));
        assertEquals("1 2 3 4 5 6 7 8 ", ArrayAlgorithms.reverseArray(new int[] {8, 7, 6, 5, 4, 3, 2, 1}));
    }
}