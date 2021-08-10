import jdk.dynalink.beans.StaticClass;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ArraysExercises {



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

            Person [] people = new Person[3];
            people[0]= new Person("ozzy");
            people[1]= new Person("eli");
            people[2]= new Person("oscar");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());

        }
        people = addPerson(people, new Person ("Mark"));
        System.out.println("with added person");
        for (Person person: people) {
            System.out.println(person.getName());
        }

//        Person[]  people= {person1, person2,person3};
//        // for each currentPerson of data type Person in the people array
//        for (Person currentPerson:people) {
//            System.out.println(currentPerson.getName());
//
//
//        }


        }
//        System.out.println("this is out add person to array");
//        addPerson(person2, people);
    public static Person [] addPerson(Person [] people, Person personToAdd){
    Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);

    newPeopleArray[newPeopleArray.length -1]= personToAdd;
    return newPeopleArray;

//    }

//    public static Person[] addPerson(Person person, Person[] peopleArray){
//        System.out.println();
//        Person[] copyArray = Arrays.copyOf(peopleArray,peopleArray.length+1);
//        copyArray[copyArray.length-1] = person;
//        System.out.println(Arrays.toString(copyArray));
//            return copyArray;

    }
}


