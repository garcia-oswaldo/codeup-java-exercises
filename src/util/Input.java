//package util;
//
//import java.util.Scanner;
//
//class Input {
//
//    private Scanner keyboardInput; //Scanner field
//
//
//    public Input() {  // Constructor.
//        keyboardInput = new Scanner(System.in);
//        System.out.println("I like to move");
//    }
//
//
//    public String getString() {
//        System.out.println("I feel good");
//        String userString = keyboardInput.nextLine();
//        return userString;
//    }
//
//    public boolean yesNo() {
//        System.out.println("Select (y/n): ");
//        String userAnswer = keyboardInput.nextLine();
//        return userAnswer.equals("y");
//    }
//
//    public int getInt() {
//        System.out.println("Give me an Integer: ");
//        int userInt = keyboardInput.nextInt();
//        return userInt;
//    }
//
//    public int getInt(int min, int max) {
//        System.out.println("Enter an integer: ");
//        int userInt = keyboardInput.nextInt();
//
//        if (userInt < min || userInt > max) {
//            System.out.println("Try again!");
//            return getInt(min, max);
//        } else {
//            System.out.println("That's a valid integer");
//            return userInt;
//        }
//    }
//
//
//
//    public double getDouble(double min, double max) {
//        System.out.println("Type in a decimal: ");
//        double userDouble = keyboardInput.nextDouble();
//
//        if (userDouble < min || userDouble > max) {
//            System.out.println("Try again!");
//            return getDouble(min, max);
//        } else {
//            System.out.println("That's a valid decimal");
//            return userDouble;
//        }
//    }
//
//    public double getDouble() {
//        return 5;
//    }
//
//    public static void main(String[] args) {
//        Input input =  new Input();
//
//    }
//
//
//
//
//}
