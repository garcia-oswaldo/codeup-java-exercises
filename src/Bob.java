import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey Bob want to go out tonight?");
        String bobResponse = scanner.nextLine();

        if (bobResponse.endsWith("?")) {
            System.out.println("Never mind dude.");
        } else if (bobResponse.endsWith("!")) {
            System.out.println("DUDE WHAT THE HECK.");
        } else if (bobResponse.isEmpty()) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("Whatever");
        }
    }
}
