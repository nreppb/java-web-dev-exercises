package exercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class CountingCharacters {

//    public static String hiddenFigures = ("If the product of two terms is " +
//        "zero then common sense says at least one of the two " +
//        "terms has to be zero to start with. So if you move all " +
//        "the terms over to one side, you can put the quadratics into " +
//        "a form that can be factored allowing that side of the equation " +
//        "to equal zero. Once you’ve done that, it’s pretty straightforward from there.");


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a a phrase:");
        String word = input.nextLine().toLowerCase();
        char[] charactersInString = word.toCharArray();
        System.out.println(Arrays.toString(charactersInString));

//        jig();
    }

    public static int count(char[] charactersInString) {
//        Integer number = 0;
        int letterTest = 0;
       for (int i=0;i<charactersInString.length;i++) {
        if (charactersInString[i] == 'i') {
            letterTest++;
        }
    }
        //System.out.println(letterTest);
       return letterTest;
    }

    public static void jig(char[] charactersInString) {
        // give the method the char array
        // and then have the count method attach the #
        // of characters to that char array letter

//        HashMap<Character, Integer> pairs = new HashMap<>();
//        for (int i = 0; i < charactersInString.length; i++) {
//            char character = charactersInString[i];
//
//            pairs.put(character, char character);
        }

//        System.out.println(pairs.keySet() + ":" + pairs.values());

//        for (Map.Entry<Character, Integer> pair : pairs.entrySet()) {
//            System.out.println(pair.getKey() + ":" + pair.getValue());
//        }

//    }
    }


