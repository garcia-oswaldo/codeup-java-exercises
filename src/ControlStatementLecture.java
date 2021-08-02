import java.util.Locale;
import java.util.Scanner;

public class ControlStatementLecture {
    public static void main(String[] args) {
        String myName = "ozzy";
        String someOneElseName = "ozzy";
//        System.out.println(myName == someOneElseName);
        System.out.println(myName.equals(someOneElseName));//use .equals to compare strings
//        System.out.println(3 >= 4);


        //Operators


//        String myName= "ozzy";
        int age = 56;
        boolean isUserNameOzzyAndIs18 = (myName.equals("ozzy") && age >= 56);
        System.out.println("does user meet requirements" + isUserNameOzzyAndIs18);

        System.out.println("would you like to coninue");
        Scanner scanner = new Scanner(System.in);
        boolean usersRespondedWithYes = scanner.nextLine().toLowerCase().contains("Y");

        System.out.println(usersRespondedWithYes);


        if (usersRespondedWithYes) {
            System.out.println("Ok we will continue");
        } else {
            System.out.println("Ok we will not continue");


        }

        // Lest ask userfor Fave color
        System.out.println(" give us your fav color");

        //
        String usersFavColor = scanner.nextLine();


        switch (usersFavColor) {
            case "blue":
                System.out.println("Thats my favorite");
                // Fall through!
            case "Red":
                System.out.println("That is bobs favorite");
                break;
            default:
                System.out.println("Default case");
                break;
        }

         boolean userAcceptedTerms = false;
        while(!userAcceptedTerms){
            System.out.println("Do you agree to our terms of services?");
            userAcceptedTerms = scanner.nextLine().toLowerCase().contains("y" +
                    "");
            System.out.println("Thank you for accepting our terms of service");
        }
        
        boolean userKnowsThierOwnName= false;
        do {
            System.out.println("Type in your name:");
            userKnowsThierOwnName = scanner.nextLine().equals("ozzy");
            
        }while(!userKnowsThierOwnName);

        // classic for loop
//        for (int i = 0; i <= 100 ; i++) {
//
//            System.out.println("We are at number" + i);
//
//        }

        // this is a for loop that will skip the number 45....

//        for (int i = 0; i < 100; i++) {
//            if(i == 45){
//                System.out.println("skipping number 45");
//                continue;
//            }
//            System.out.println(i);
//        }

        // This will stop at 45 with break
        for (int i = 0; i < 100; i++) {
        if (i==45){
            System.out.println("Breaking at  45");
            break;
        }
            System.out.println(i);
        }

    }
}