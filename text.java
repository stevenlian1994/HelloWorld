package com.stevenlian;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int newInt1 = 5; //5x5 initializer

        int[][] setArray = randomizedArray(newInt1); //called method that randomized each object in the array and then 'locked it'
        System.out.println(Arrays.deepToString(setArray)); //visualization for coder
        raceOneToFive(setArray, newInt1); //this method will take the locked method and organize it from biggest to smallest


        //first let's create a method that creates a 5x5 array with random numbers generated: checked
        // second let's reorganize each row from biggest to smallest (race 1-5)
        //third we organize the first "column" (race 6)
        //fourth we compare 2nds and 3rds (race 7)
        //return 1 - 3
    }


    public static int[][] randomizedArray(int n) {
        int[][] array2 = new int[n][n];
        for (int j = 0; j < n; j++) {

            for (int i = 0; i < n; i++) {

                int newDouble = (int) (1000 * Math.random());
                array2[i][j] = newDouble;
            }
        }
        return array2;

    }

    public static void raceOneToFive(int[][] raceOneToFiveArray, int n) {
        Integer[] integerArray = new Integer[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                integerArray[i] = raceOneToFiveArray[i][j];
            }
        }


        Arrays.sort(integerArray, Collections.reverseOrder());
        System.out.println(Arrays.deepToString(integerArray));
    }

    // how can incorporate objects from the main method within your method

}

