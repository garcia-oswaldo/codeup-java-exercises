import java.util.Scanner;

public class MethodsExercises {
    static Scanner in = new Scanner(System.in);
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

    public static int getIntegerRecursion(int min, int max) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userResponse = userInput.nextInt();

        if (userResponse >= min && userResponse <= max) {
            return userResponse;
        } else {
            System.out.println(userResponse + " is not within the range.");
            return getInteger(min, max);
        }

    }

// MY get integer needs work

//    public static int getInteger(int min, int max) {
//
//        Scanner input= new Scanner (System.in);
//        System.out.println(userResponse);
//        do {
//            System.out.println("please enter a number between" + " " + min + " " + "and" + " " + max);
//            int userResponse = Scanner.nextInt();
//            if (userResponse >= min && userResponse <= max) {
//                return userResponse;
//            }
//        } while (true);
//    }

    public static int getInteger(int min, int max) {

        Scanner userInput = new Scanner(System.in);

        int userResponse = min - 1;
        boolean hasLoopRanOnce = false;

        do {

            if (hasLoopRanOnce) {
                System.out.println(userResponse + " is not within the range.");
            }

            System.out.print("Enter a number between " + min + " and " + max + ": ");
            userResponse = userInput.nextInt();

            hasLoopRanOnce = true;

        } while (!(userResponse >= min && userResponse <= max));

        return userResponse;

    }
//
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
//          Factorial();
//        }
//        else if(factAnswer.equals("n") || factAnswer.equals("N")){
//            System.out.println("Ending Method.");
//        }
//        else{
//            System.out.println("Response not recognized; Ending Method.");
//        }
//    }
//
//    public static getTree(int Num){
//        String returnString="";
//        for (int i = 1; i <=Num ; i++) {
//            if (i == Num) {
//                returnString += i;
//            } else {
//                returnString += i + "x";
//            }
//        }
//
//        public static int getFactorialSum(int num){
//            int sum=1;
//            for (int i = 2; i <=num ; i++) {
//                sum *=i;
//
//            }
//            return sum;
//        }
//
//    public long getFactorial() {
//        int factorialNumber = getInteger(1, 10);
//        for (int i = 1; i <= factorialNumber; i++) {
//            System.out.println(i + "!=" + i + "=" + i);
//        }
//        return factorialNumber;
//    }

    //public static void main(String[] args) {
//
//    System.out.println(10 == add(5, 5));
//    System.out.println(5 == subtract(10, 5));
//    System.out.println(25 == multiply(5, 5));
//    System.out.println(4 == divide(100, 25));
//    System.out.println(2 == modulous(14, 3));
//    System.out.println(getInteger(2, 9));
//}
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void rollTheDice() {
        Scanner userInput = new Scanner(System.in);
        System.out.println(" What are the number of sides for your dice ");
        int numberOfSides = getInteger(2, 20);
        int firstRoll = getRandomNumber(1, numberOfSides);
        int secondRoll = getRandomNumber(1, numberOfSides);
        System.out.println("first roll ==>%d\n" + firstRoll);
        System.out.println("second roll ==>%d\n" + secondRoll);

        System.out.println("Would you like to continue?");
        String usersResponse = userInput.nextLine();
        boolean doesUserWantToContinue = usersResponse.toLowerCase().contains("y");


        if (doesUserWantToContinue) {

            rollTheDice();
        }

    }
}






