//  Flint Eller
//  1/8/19
// This program checks groups of 23 birthdays for matches then reports overall percentage of a match after many runs

package com.company;

public class TheBirthdayParadox {

    //  This generates 23 random numbers 1-365 and puts them in an array
    public static int[] dates(int num){
        int[] birthdays = new int[num];
        for(int start = 0; start < num; start ++) {
            int day = (int) (Math.random() * 365 + 1);
            birthdays[start] = day;
        }

        return birthdays;
    }
    // Checks to see if there is a match in each array
    public static boolean hasDupes(int[] birthdays){
        boolean bool = false;
        for(int x = 0; x < birthdays.length; x++) {
            for (int y = 0; y < birthdays.length; y++) {
                // if x and y are on the same number then discount this match
                if(x == y && bool == false)
                    bool = false;
                else if (birthdays[x] == birthdays[y]) {
                    bool = true;
                    break;
                }
            }
        }
        return bool;
    }


    public static void main(String[] args){
        //  number of times you want to run the problem
        int num_sims = 1000;
        double y = 0;
       for(int start = 0; start < num_sims; start++){
           int[] birthdays = dates(23);
           boolean bool = hasDupes(birthdays);
            // if there is a match then add one
           if(bool)
               y++;
       }

       System.out.println("The percent of times there were duplicate birthdays is " + ( y / num_sims * 100) + "%");

    }
}
