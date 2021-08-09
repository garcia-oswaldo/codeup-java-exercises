public class Highlow {
    public class HighLow {


        public int getUsersToGuessedNumber(){
            System.out.println("Guess the number.");
            int usersGuessedNum = MethodsExercises.getInteger(1,100);
            return  usersGuessedNum;
        }

        public  void giveHelpfulHint(int guessedNumber, int ActualNumber){

            if (guessedNumber > ActualNumber){
                System.out.println("You need to go LOWER!");
            }else if(guessedNumber < ActualNumber){
                System.out.println("You need to go HIGHER!");
            }
        }

        public  void highLowGame() {

            int randomNumber = MethodsExercises.getRandomNumber(1,100);
            int usersLastGuess;
            int numberOfTries = 0;


            do {

                usersLastGuess = getUsersToGuessedNumber();
                giveHelpfulHint(usersLastGuess,randomNumber);
                numberOfTries++;

            }while (usersLastGuess != randomNumber);

            System.out.println("Hey you guessed right in " + numberOfTries + " number of tries!");

        }

        public  void main(String[] args) {

            highLowGame();

        }

    }
}
