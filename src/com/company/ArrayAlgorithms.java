package com.company;

public class ArrayAlgorithms {

    public static String printArray(int[] nums){
        String str = "";
        for(int x = 0; x < nums.length; x++){
            str += nums[x] + " ";
        }
        return str;
    }

    public static boolean checkForAllNegatives(int[] nums){
        boolean bool = true;
        for(int x = 0; x < nums.length; x++){
            if(nums[x] >= 0 )
                bool = false;
        }
        return bool;
    }

    public static boolean hasDupes(int[] nums){
        boolean bool = false;
        for(int x = 0; x < nums.length; x++) {
            for (int y = 0; y < nums.length; y++) {
                if(x == y)
                    bool = false;
                else if (nums[x] == nums[y]) {
                    bool = true;
                    break;
                }

            }
        }

        return bool;
    }

    public static int countEvens(int[] arr){
        int num_evens = 0;
        for(int x = 0; x < arr.length; x++){
            if(arr[x] % 2 == 0){
                num_evens++;
            }
        }
        return num_evens;
    }

    public static int[] leftShift(int[] nums, int shift){
        int[] new_array = new int[nums.length + shift];

        for(int x = 0; x < nums.length; x++){
            new_array[x] = nums[x];
        }
        for(int x = nums.length; x < nums.length + shift; x++)
            new_array[x] = 0;


        return new_array;
    }

    public static String reverseArray(int[] arr){
        int temp;
        int last = arr.length - 1;
        for(int start = 0; start < (arr.length / 2); start++){
            temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;

            last--;
        }
        return printArray(arr);

    }


    public static void main(String[] args){
        int[] list1 = {-2, -9, -6, -8, -9, -3, -1};
        System.out.println(printArray(list1));

        int[]list2 = {-2, -9, -6, -8, -9, -3, 0};
        System.out.println(checkForAllNegatives(list1));
        System.out.println(checkForAllNegatives(list2));

        int[] list3 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 5};
        int[] list4 = {5, 23, 7, 14, 39, 46, 52, 65, 75, 83, 76, 44, 90, 6, 2, 11};
        System.out.println(hasDupes(list3));
        System.out.println(hasDupes(list4));

        int[] list5 = {12, 3, 72, 16, 47, 46, 92, 12, 18, 36, 76, 51, 99, 101, 42, 42};
        System.out.println(countEvens(list3));
        System.out.println(countEvens(list5));

        int[] list6 = {1, 0, 1, 1, 0, 1, 0, 1};
        System.out.println(leftShift(list6, 6));

        int[] arr = {5, 7, 4, 9, 8, 1, 4, 3, 0, 5, 2};
        System.out.println(reverseArray(arr));



    }

}
