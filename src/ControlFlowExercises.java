import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 2;
//        do {
//            System.out.println(i);
//            i = 2+i;
//        }
//        while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i = i-5;
//        }
//        while (i >= -10);

//

//        for (int i = 0; i <= 15; i++) {
//            System.out.println(i);
//
//        }

//        for (int i  = 0; i <= 100; i+=2) {
//            System.out.println(i);
//
//        }

//        for (int i  = 100; i >= 0; i-=5) {
//            System.out.println(i);
//
//        }

        for (long i = 2; i < 1000000; i = (long) Math.pow(i,2)) {
            System.out.println(i);

        }
    }
}

