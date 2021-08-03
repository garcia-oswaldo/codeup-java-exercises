import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i + " ");
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i = 2+i;
//        }
//        while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i = i-5;
//        }
//        while (i >= -10);

//
//        long twoCounter =2L;
//        do{
//          System.out.println(twoCounter);
//          twoCounter*=twoCounter;
//        }while(twoCounter<1000000L);

//        for (int i = 0; i <= 15; i++) {
//            System.out.println(i);
//
//        }

//        for (int i  = 0; i <= 100; i+=2) {
//            System.out.println(i);
//
//        }

//        for (int i  = 100; i >= 0; i-=5) {
//            System.out.println(i);
//
//        }

//        for (long i = 2; i < 1000000; i = (long) Math.pow(i,2)) {
//            System.out.println(i);
//
//        }

        //fizz buzz

//        for (int i = 1; i <= 100; i++) {
//            if (i % 5 == 0 && i % 3 == 0) {
//                System.out.println(i + "fizzbuzz");
//            } else if (i % 5 == 0) {
//                System.out.println(i + "Buzz");
//            } else if (i % 3 == 0) {
//                System.out.println(i + "fizz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //Display table of powers
//        boolean userContinues = true;
//        do{
//            System.out.println("What number would you like to go up to?");
//            int userInt=scanner.nextInt();
//            System.out.println("\nhere is your table\n");
//            System.out.println("Number | squared| Cubed|");
//            for (int i = 1; i <= userInt ; i++) {
//                System.out.printf("%-6d", i);
//                System.out.println(" | ");
//                System.out.printf("%-7d", i*i);
//                System.out.println(" | ");
//                System.out.print(i*i*i);
//                System.out.println();
//
//            }
//            System.out.println("would you like to enter another number (Y/N)");
//            String userResponse = scanner.next();
//            if (userResponse.equalsIgnoreCase("y")){
//                userContinues = false;
//            }
//        } while(userContinues);
//
//        boolean anotherGrade = true;
//
//        do{
//            System.out.println("Please enter a numberical grade from 0-100");
//            int userGrade = scanner.nextInt();
//            if(userGrade >= 88){
//                System.out.println("A");
//            }else if (userGrade >= 80){
//                System.out.println("B");
//            }else if(userGrade >=67){
//                System.out.println("C");
//            }else if(userGrade>=60){
//                System.out.println("D");
//            }else {
//                System.out.println("F");
//            }
//            System.out.println("do you want to enter another grade? Y/N?");
//            String userResponse= scanner.next();
//            if (!userResponse.equalsIgnoreCase("y")){
//                            anotherGrade = false;}
//        }while(anotherGrade);

//        String message = "Hello";
//        System.out.println(message); // prints "Hello"
//        message = message + " World!";
//        System.out.println(message); // prints "Hello, World!"

        //Comparing strings

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput = sc.next();

//        // Don't do this!
//        boolean confirmation = userInput == "y";
//
//        // DON'T DO THIS
//        if ("I am a string" == "I am a string") {
//            System.out.println("Strings are equal");
//
//            // Do this instead!
//            if ("I am a string".equals("I am a string")) {
//                System.out.println("Strings are equal");


        // String Comparison Methods

//        .equals	determine, case-sensitively, if two strings have the same value.
//        .equalsIgnoreCase	determine if two strings have the same value, disregarding their casing.
//        .startsWith	determine, case-sensitively, if one string starts with another.
//        .endsWith	determine, case-sensitively, if one string ends with another.
//        String input = "Codeup Rocks!";
//
//        input.equals("codeup rocks!"); // false
//        input.equals("Codeup Rocks!"); // true
//
//        input.equalsIgnoreCase("codeup rocks!"); // true
//        input.equalsIgnoreCase("Codeup Rocks!"); // true
//
//        input.startsWith("codeup"); // false
//        input.startsWith("Codeup"); // true
//
//        input.endsWith("rocks"); // false
//        input.endsWith("rocks!"); // false
//        input.endsWith("Rocks!"); // true


//        StringManipulation
//        The following methods can be used to manipulate strings:

//            String input ="Codeup Rocks";
////        char charAt(int index)
////        Returns the character at the specified index of the string.
//        System.out.println(input.charAt(3));
//
////        int indexOf(String subString)
////        Returns the index of the first occurrence of a certain substring.
////                Returns -1 if the substring is not found.
//        System.out.println(input.indexOf("c"));
//
////        int lastIndexOf(String subString)
////        Like indexOf, but starts the search from the end of the string.
//        System.out.println(input.lastIndexOf("o"));
////        int length()
////        Returns the length of a string.
//        System.out.println(input.length());
////        String replace(String pattern, String replacement)
////        Returns a copy of the string that has pattern replaced with replacement.
////        String replaceSentence =  " I love the color red. I love the color blue. I love the color yellow";
////        System.out.println(replaceSentence.replace("love", "like"));
////        String substring(int beginIndex[, int endIndex])
////        Returns a new substring that starts at a specified index and (optionally) ends at the specified index
//        System.out.println(input.substring(0,6));
////        String toLowerCase()
////        Returns a string that has all lower case letters.
//        System.out.println(input.toLowerCase());
////                String toUpperCase()
////        Returns a string that has all upper case letters.
//        System.out.println(input.toUpperCase());
////                String trim()
////        Returns a copy of the string without leading and trailing whitespaces.
//        System.out.println(input.trim());

            }
        }




