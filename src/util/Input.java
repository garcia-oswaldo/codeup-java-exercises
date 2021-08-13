
package util;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Input {

    public Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
//        System.out.println("Type Something: ");
        String userString = scanner.nextLine();
        return userString;
    }

    public boolean yesNo() {
//        System.out.println("Select (y/n):");
        String userAnswer = scanner.next();
        return userAnswer.equals("y");
    }

    public int getInt(int min, int max) {
        System.out.println("Give me an integer: ");
        int userInt;
//        int userInt = scanner.nextInt();
//            getInt();
        try {
            userInt = Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("THIS IS NOT AN INTEGER ");
            return getInt(min, max);
        }
        if (userInt < min || userInt > max) {
            System.out.println("Out of range Try again!");
            return getInt(min, max);
        } else {
//            System.out.println("That's a valid integer.");
            return userInt;
        }
    }

    public int getInt() {
        System.out.print("Give me an integer: ");
        int userInt = 0;
        try {
//              int userInt = scanner.nextInt();
          userInt =  Integer.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {

        }

      
        return userInt;
    }


    public double getDouble(double min, double max) {
        double userDouble;
        System.out.println("Give me an decimal: ");
//        double userDouble = scanner.nextDouble();
        try {
            userDouble = Double.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("pendejo get it right");
            return getDouble(min, max);
        }
        if (userDouble < min || userDouble > max) {
            System.out.println("Try again!");
            return getDouble(min, max);
        } else {
            System.out.println("That's a valid decimal.");
            return userDouble;
        }
    }

    public double getDouble() {
        System.out.println("Give me a decimal: ");

        try {
            return Double.valueOf(scanner.nextLine());

        } catch (NumberFormatException e) {
            return getDouble();
        }
    }


}
//