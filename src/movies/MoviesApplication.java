package movies;

import util.Input;

public class MoviesApplication {

    public static void main(String[] args) {
        boolean running = true;
    while (running){
        System.out.println(returnMenuDisplay());
        int response= promptAndReturnUserChoice();
        running = executeUserChoice(response);
    }

    }
    private static boolean executeUserChoice(int choice){
        boolean continueRunningApp= true;

        switch(choice){

            case 0:
                System.out.println("goodbye!");
                continueRunningApp = false;
                break;
            case 1:
                for(Movie movie: MoviesArray.findAll()){
                    System.out.printf("%s--%s\n", movie.getName(), movie.getCategory());
                }
                break;
            case 2:
                System.out.println();
                viewMoviesByCategory("amimated");
                System.out.println();
                break;
            case 3:
                System.out.println();
                viewMoviesByCategory("drama");
                System.out.println();
                break;
            case 4:
                System.out.println();
                viewMoviesByCategory("horror");
                System.out.println();
                break;
            case 5:
                System.out.println();
                viewMoviesByCategory("scifi");
                System.out.println();
                break;
        }
        return continueRunningApp;
    }
    private  static void viewMoviesByCategory(String category) {
        for(Movie movie : MoviesArray.findAll()){
            if(movie.getCategory().equalsIgnoreCase(category)){
                System.out.printf("%s--%s\n", movie.getName(),movie.getCategory());
            }
        }
    }

    private static int promptAndReturnUserChoice(){
    Input input = new Input();
    System.out.println("enter your Choice");
    int userResponse = input.getInt(0,5);
    return userResponse;
    }

    private static String returnMenuDisplay(){

    String menu = "what would you like to do?\n" +
                "\n" +

        "0 - exit\n" +
        "1 - view all movies\n" +
        "2 - view movies in the animated category\n" +
        "3 - view movies in the drama category\n" +
        "4 - view movies in the horror category\n" +
        "5 - view movies in the scifi category\n";
        return menu;
    }
}