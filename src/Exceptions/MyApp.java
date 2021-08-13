package Exceptions;

import util.Input;

import java.util.InputMismatchException;

public class MyApp {
    public static final int INVALID_CHOICE =0;
    private static final int EXIT_CHOICE = 3;

    /* main menu-pringintt and user choice loop
    loop will exit when user enters quit choic (3)
    1. print hello
    2. print Im hungry
    3. quit
     */
    public void runMyApp(){
        int userChoice = INVALID_CHOICE;
        Input input= new Input();
        do{
            printMenu();
            try {
                userChoice = input.getInt(1, 3);
            }catch(InputMismatchException e){
                System.out.println("Please type an interger between 1 and 3");
                input = new Input();
            }
        }while(userChoice!=EXIT_CHOICE);

    }
    public void printMenu(){
        System.out.println("enter 1 or 2 or 3");
    }


    public static void main(String[] args) {
        // 1. create an application object
        // run the menu loop
        //3. exit the program when user enters quit option

        MyApp myApp= new MyApp(); //1
        myApp.runMyApp();//2
        System.out.println("end of program");
    }

}
