import java.util.Scanner;

public class MethodsExercises {
    static Scanner in = new Scanner(System.in);

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        return num1 / num2;
    }

    public static double modulous(double num1, double num2) {
        return num1 % num2;
    }

    public static int getInteger(int min, int max) {


//        System.out.println(userResponse);
        do {
            System.out.println("please enter a number between" + " " + min + " " + "and" + " " + max);
            int userResponse = in.nextInt();
            if (userResponse >= min && userResponse <= max) {
                return userResponse;
            }
        } while (true);
    }

    public static long Factorial(int num, long factorial) {

    }

public static void main(String[] args) {

        System.out.println(10==add(5,5));
        System.out.println(5==subtract(10,5));
        System.out.println(25==multiply(5,5));
        System.out.println(4==divide(100,25));
        System.out.println(2==modulous(14,3));
        System.out.println(getInteger(2,9));


    }
}


