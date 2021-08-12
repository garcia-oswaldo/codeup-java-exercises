package grades;
import util.Input;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {

        HashMap<String, Student> students = new HashMap<>();
//        student.put("Ryan", "ryanorsinger");
//        student.put("Zach", "zgulde");
//        student.put("Fernando", "fmendozaro");
//        student.put("Justin", "jreich5");

        Student tom = new Student("tom");
        tom.addGrade(70);
        tom.addGrade(80);
        tom.addGrade(90);

        Student bob = new Student("tom");
        bob.addGrade(100);
        bob.addGrade(50);
        bob.addGrade(90);

        Student bill = new Student("tom");
        bill.addGrade(70);
        bill.addGrade(30);
        bill.addGrade(90);

        Student laura = new Student("tom");
        laura.addGrade(70);
        laura.addGrade(30);
        laura.addGrade(90);

        students.put("tom", tom);
        students.put("bob", bob);
        students.put("bill", bill);
        students.put("laura", laura);
        commandLineInterface(students);
// and putting some data into it

    }

    public static void commandLineInterface(HashMap<String, Student> students) {
        
        System.out.println("Welcome!" + " \n" + "Here are the Git hub usernames of our students:");
        Input input;
        do {
            input = new Input();


            for (String key : students.keySet()) {
                System.out.println(key + " ");
            }
            System.out.println("Waht student would you like to see more infromation on:");
            String userkey = input.getString();
            if (students.containsKey(userkey)) {
                Student currentStudent = students.get(userkey);
                System.out.println("Name: " + currentStudent.getStudentName() + "github" + userkey);
                System.out.println("current average" + currentStudent.getGradeAverage());

            } else {
                System.out.println("Sorry no student with the github user name :" + userkey);
            }
            System.out.println("Would you like to see another student?");
        } while (input.yesNo());
        System.out.println("Y/N");
    }
}
