package com.company;

import java.lang.reflect.Array;

public class TraverseArrays {

    public static int countEven(int[] nums){
        int num_evens = 0;
        for(int start = 0; start < nums.length; start++){
            if(nums[start] % 2 == 0)
                num_evens ++;
        }
        return num_evens;
    }

    public static int[] buildArray(int num){
        int[] list = new int[num];
        for(int start = 0; start < num; start++){
              list[start] += start;
          }
          return list;
    }

    public static boolean sum28(int[] numbers){
        int sum = 0;
        for(int start = 0; start < numbers.length; start++){
            if(numbers[start] == 2)
                sum += 2;
        }

        if (sum == 8)
            return true;
        else
            return false;
    }

    public static int[] zeroMax(int[] original){

        for(int start = 0; start < original.length; start++) {
            int biggest = 0;
            if(original[start] == 0) {
                for (int start2 = start; start2 < original.length; start2++){
                    if(original[start2] > biggest)
                        biggest = original[start2];
                    original[start] = biggest;
                }

            }

        }



        return original;
    }




    public static void main(String[] args){
        //int[] nums = {2, 1, 2, 3, 4};
        //System.out.println(countEven(nums));

        //System.out.println(buildArray(8));

        //int[] num_list = {2, 3, 2, 2, 4};
        //System.out.println(sum28(num_list));

        //int[] numbers = {0, 1, 0};
        //System.out.println(zeroMax(numbers));

    }
}
