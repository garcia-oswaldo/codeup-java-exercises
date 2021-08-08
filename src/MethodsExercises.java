//import java.util.Scanner;
//
//public class MethodsExercises {
//    static Scanner in = new Scanner(System.in);
//
//    public static int add(int num1, int num2) {
//        return num1 + num2;
//    }
//
//    public static int subtract(int num1, int num2) {
//        return num1 - num2;
//    }
//
//    public static int multiply(int num1, int num2) {
//        return num1 * num2;
//    }
//
//    public static double divide(double num1, double num2) {
//        return num1 / num2;
//    }
//
//    public static double modulous(double num1, double num2) {
//        return num1 % num2;
//    }
//
//    public static int getInteger(int min, int max) {
//
//
////        System.out.println(userResponse);
//        do {
//            System.out.println("please enter a number between" + " " + min + " " + "and" + " " + max);
//            int userResponse = in.nextInt();
//            if (userResponse >= min && userResponse <= max) {
//                return userResponse;
//            }
//        } while (true);
//    }

//        public static void factorial(){
//        Scanner scanner = new Scanner(System.in);
//
//        int input = getInteger(1, 20);
//        System.out.println(factorial());
//
//        System.out.println("Do you want to continue? (Y/N)");
//        String factAnswer = scanner.nextLine();
//
//        if(factAnswer.equals("y") || factAnswer.equals("Y")){
//            askFactorial();
//        }
//        else if(factAnswer.equals("n") || factAnswer.equals("N")){
//            System.out.println("Ending Method.");
//        }
//        else{
//            System.out.println("Response not recognized; Ending Method.");
//        }
//    }

//
//    public long getFactorial() {
//        int factorialNumber = getInteger(1, 10);
//        for (int i = 1; i <= factorialNumber; i++) {
//            System.out.println(i + "!=" + i + "=" + i);
//        }
//        return factorialNumber;
//    }
//
//public static void main(String[] args) {
//
//        System.out.println(10==add(5,5));
//        System.out.println(5==subtract(10,5));
//        System.out.println(25==multiply(5,5));
//        System.out.println(4==divide(100,25));
//        System.out.println(2==modulous(14,3));
//        System.out.println(getInteger(2,9));
//
//
//    }
//}
//
//
