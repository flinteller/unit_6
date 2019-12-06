package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayCreationTest {

    @org.junit.Test
    public void getAverageTest() {
        double[] numbers = {89, 75, 100};
        double[] numbers2 = {89, 75};
        double[] numbers3 = {89, 75, 100, 64, 100, 82, 91, 93};
        assertEquals(88.0, ArrayCreation.getAverage(numbers), 0.01);
        assertEquals(0.0, ArrayCreation.getAverage(numbers2), 0.01);
        assertEquals(94.0, ArrayCreation.getAverage(numbers3), 0.01);
    }

    @Test
    public void stringArrayTest() {
        String[] names = {"Fred", "Barney", "Betty", "Wilma", "Pebbles"};
        String[] names2 = {"Fred", "Barney", "Betty", "Wilma"};
        String[] names3 = {"Brian", "Rex", "Matthew", "Rich", "Demetri"};
        String[] names4 = {"Fred", "Barney", "Betty", "Wilma", "Pebbles", "Bam-Bam"};
        assertEquals("4 6 5 5 7 ", ArrayCreation.stringArray(names));
        assertEquals("", ArrayCreation.stringArray(names2));
        assertEquals("5 3 7 4 7 ", ArrayCreation.stringArray(names3));
        assertEquals("", ArrayCreation.stringArray(names4));
    }

    @Test
    public void countryDataTest() {
        String phrase1 = "The capital of China is Beijing and the primary language is Mandarin";
        String phrase2 = "The capital of Egypt is Cairo and the primary language is Arabic";
        String phrase3 = "The capital of France is Paris and the primary language is French";
        String phrase4 = "The capital of South Korea is Seoul and the primary language is Korean";
        String phrase5 = "The capital of Germany is Berlin and the primary language is German";
        String phrase6 = "The capital of India is New Delhi and the primary language is Hindi";
        String phrase7 = "The capital of Japan is Tokyo and the primary language is Japanese";
        String phrase8 = "The capital of Ghana is Accra and the primary language is Akuapem Twi";
        String phrase9 = "The capital of Kenya is Nairobi and the primary language is Swahili";
        String phrase10 = "The capital of Mexico is Mexico City and the primary language is Spanish";
        String phrase11 = "The capital of United Kingdom is London and the primary language is English";
        String phrase12 = "The capital of Burkina Faso is Ouagadougou and the primary language is French";
        String phrase13 = "The capital of United States is Washington D.C. and the primary language is English";

        boolean foundPhrase1 = false;
        boolean foundPhrase2 = false;
        boolean foundPhrase3 = false;
        boolean foundPhrase4 = false;
        boolean foundPhrase5 = false;
        boolean foundPhrase6 = false;
        boolean foundPhrase7 = false;
        boolean foundPhrase8 = false;
        boolean foundPhrase9 = false;
        boolean foundPhrase10 = false;
        boolean foundPhrase11 = false;
        boolean foundPhrase12 = false;
        boolean foundPhrase13 = false;

        for (int i=0; i<1000; i++) {
            String phrase = ArrayCreation.countryData();
            if (phrase.equals(phrase1))
                foundPhrase1 = true;
            if (phrase.equals(phrase2))
                foundPhrase2 = true;
            if (phrase.equals(phrase3))
                foundPhrase3 = true;
            if (phrase.equals(phrase4))
                foundPhrase4 = true;
            if (phrase.equals(phrase5))
                foundPhrase5 = true;
            if (phrase.equals(phrase6))
                foundPhrase6 = true;
            if (phrase.equals(phrase7))
                foundPhrase7 = true;
            if (phrase.equals(phrase8))
                foundPhrase8 = true;
            if (phrase.equals(phrase9))
                foundPhrase9 = true;
            if (phrase.equals(phrase10))
                foundPhrase10 = true;
            if (phrase.equals(phrase11))
                foundPhrase11 = true;
            if (phrase.equals(phrase12))
                foundPhrase12 = true;
            if (phrase.equals(phrase13))
                foundPhrase13 = true;
        }

            boolean foundAll = foundPhrase1 && foundPhrase2 && foundPhrase3 && foundPhrase4 && foundPhrase5 &&
                    foundPhrase6 && foundPhrase7 && foundPhrase8 && foundPhrase9 && foundPhrase10 && foundPhrase11 &&
                    foundPhrase12 && foundPhrase13;

            assertTrue(foundAll);
        }



    }
