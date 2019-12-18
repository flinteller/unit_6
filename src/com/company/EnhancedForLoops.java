package com.company;

public class EnhancedForLoops {

    public static String printStandardFor(String[] arr){
        String str = "";
        for(int x = 0; x < arr.length; x++){
            str += arr[x] + " ";
        }
        return str;
    }

    public static String printStandardFor(int[] arr){
        String str = "";
        for(int x = 0; x < arr.length; x++){
            str += arr[x] + " ";
        }
        return str;
    }

    public static String printStandardFor(double[] arr) {
        String str = "";
        for(int x = 0; x < arr.length; x++){
            str += arr[x] + " ";
        }
        return str;
    }

    public static String printEnhancedFor(String[] arr){
        String str = "";
        for(String x : arr){
            str += x + " ";
        }
        return str;
    }

    public static String printEnhancedFor(int[] arr){
        String str = "";
        for(int x : arr){
            str += x + " ";
        }
        return str;
    }

    public static String printEnhancedFor(double[] arr){
        String str = "";
        for(double x : arr){
            str += x + " ";
        }
        return str;
    }

    public static String printStandardWhile(String[] arr) {
        String str = "";
        int x = 0;
        while(x < arr.length){
            str += arr[x] + " ";
            x++;
        }
        return str;
    }

    public static String printStandardWhile(int[] arr) {
        String str = "";
        int x = 0;
        while(x < arr.length){
            str += arr[x] + " ";
            x++;
        }
        return str;
    }

    public static String printStandardWhile(double[] arr) {
        String str = "";
        int x = 0;
        while(x < arr.length){
            str += arr[x] + " ";
            x++;
        }
        return str;
    }


    public static void main(String[] args){
        int[] ints = {9, 1, 1, 2, 3};
        String[] strs = {"Mark", "Brandon", "Micah", "Brian", "Flint"};
        double[] dubs = {6.9, 7.5, 1.1, 5.0, 0.3};

        System.out.println(printStandardFor(strs));
        System.out.println(printStandardFor(ints));
        System.out.println(printStandardFor(dubs));

        System.out.println(printEnhancedFor(strs));
        System.out.println(printEnhancedFor(ints));
        System.out.println(printEnhancedFor(dubs));

        System.out.println(printStandardWhile(strs));
        System.out.println(printStandardWhile(ints));
        System.out.println(printStandardWhile(dubs));
    }

}
