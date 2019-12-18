package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class EnhancedForLoopsTest {

    public static int[] list = {7, 5, 3, 8, 11, -4, 0, -2};
    public static double[] doubleList = {6.5, 4.7, -2.4, 0.0, -8, 3.14, -12};
    public static String[] strList = {"Sporty", "Scary", "Baby", "Posh", "Ginger"};

    @Test
    public void printStandardFor() {
        assertEquals("7 5 3 8 11 -4 0 -2 ", EnhancedForLoops.printStandardFor(list));
        assertEquals("6.5 4.7 -2.4 0.0 -8.0 3.14 -12.0 ", EnhancedForLoops.printStandardFor(doubleList));
        assertEquals("Sporty Scary Baby Posh Ginger ", EnhancedForLoops.printStandardFor(strList));
    }


    @Test
    public void printEnhancedFor() {
        assertEquals("7 5 3 8 11 -4 0 -2 ", EnhancedForLoops.printEnhancedFor(list));
        assertEquals("6.5 4.7 -2.4 0.0 -8.0 3.14 -12.0 ", EnhancedForLoops.printEnhancedFor(doubleList));
        assertEquals("Sporty Scary Baby Posh Ginger ", EnhancedForLoops.printEnhancedFor(strList));
    }



    @Test
    public void printStandardWhile() {
        assertEquals("7 5 3 8 11 -4 0 -2 ", EnhancedForLoops.printStandardWhile(list));
        assertEquals("6.5 4.7 -2.4 0.0 -8.0 3.14 -12.0 ", EnhancedForLoops.printStandardWhile(doubleList));
        assertEquals("Sporty Scary Baby Posh Ginger ", EnhancedForLoops.printStandardWhile(strList));
    }


}