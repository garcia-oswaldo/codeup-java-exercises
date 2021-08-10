import java. util. Random;
public class ServerNameGenerator {


   static String [] adjectives={"fat", "loser", "tall", "young", "old", "mean", "brave", "silly", "stout", "weak"};
   static String [] noun={"Oscar", "Eli", "Ozzy", "Herman", "Sam", "Ry", "John", "victor", "larry", "peter"};

   // does not matter what array because it looks at both.
    static String getword(String[] choices) {
        Random random = new Random();
        int randomNumber = random.nextInt(choices.length);
        return choices[randomNumber];

    }
    public static void main(String[] args) {
        System.out.println("here is your server name");
        System.out.println(getword(adjectives)+ " " +getword(noun));

//        String[] arr={"fat", "loser", "tall", "young", "old", "mean", "brave", "silly", "stout", "weak"};
//        Random r=new Random();
//        int randomNumber=r.nextInt(arr.length);
//        System.out.println(arr[randomNumber]);



}
    }