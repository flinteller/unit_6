package com.company;

public class ArrayCreation {

    public static double getAverage(double[] nums){
        if(nums.length < 3)
            return 0.0;
        else {
            double first = nums[0];
            double mid = nums[nums.length / 2];
            double last = nums[nums.length - 1];

            double avg = (first + mid + last) / 3;
            return avg;
        }
    }

    public static String stringArray(String[] friends){
        String indexes = "";
        if(friends.length != 5)
            return "";
        else {
            for(int start = 0; start <5; start++)
                indexes += friends[start].length() + " ";

        }
        return indexes;
    }

    public static String countryData(){
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana", "Kenya", "Mexico", "United Kingdom", "Burkina Faso", "United States"};
        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi", "Mexico City", "London", "Ouagadougou", "Washington D.C."};
        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi", "Swahili", "Spanish", "English", "French", "English"};

        int rand_num = (int) (Math.random() * countries.length);

        return "The capital of " + countries[rand_num] + " is " + capitals[rand_num] + " and the primary language is " + languages[rand_num];


    }

    public static void main(String[] args){
        double[] nums = {89, 75, 100, 64, 100, 82, 91, 93};
        System.out.println(getAverage(nums));

        String[] friends = {"Fred", "Barney", "Betty" , "Wilma", "Pebbles"};
        System.out.println(stringArray(friends));

        System.out.println(countryData());
    }
}
