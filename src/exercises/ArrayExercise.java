package exercises;

import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] someNums = {1,1,2,3,5,8};
        String suess = ("I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not " +
                "eat them in a house. I will not eat them with a mouse.");
       String[] arrSuess = suess.split("\\.");
        System.out.println(java.util.Arrays.toString(arrSuess));

        for (int i: someNums) {
            if ((i%2) != 0) {
                System.out.println(i);
            }
        }


    }
}
