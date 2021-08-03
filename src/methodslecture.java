import java.util.Scanner;

public class methodslecture {
    //Methods will be  declared inside of
    // class but outside of the main method/

    static double piValue = 3.14;


    public static String sayHello(String userName) {
        String helloMessage = String.format("Hello, %s!", userName);
        return helloMessage;
    }

    //method overloading creating various methods to cover different data type.
    public static double getAreaOfCircle(long radius) {
        return piValue * (radius * radius);
    }

    public static double getAreaOfCircle(double radius) {
        return piValue * (radius * radius);
    }

    public static boolean doesUserWantToContinue() {
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to conintue?");
        String usersResponse = input.nextLine();
        if (usersResponse.equals("yes")) {
            return true;
        } else if (usersResponse.equals("no")) {
            return false;
        } else {
            return doesUserWantToContinue();
        }
    }

    //this executes the code, and methods
    // should not be declared in the main.
    public static void main(String[] args) {

        if (doesUserWantToContinue()) {
            System.out.println(sayHello("Allison"));
            int radiusOfCircle = 4;
            System.out.println(getAreaOfCircle(radiusOfCircle));

        }


    }
}
