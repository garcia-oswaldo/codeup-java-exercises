import java.util.ArrayList;
import java.util.HashMap;

public class CollectionsDemo {
    public static void main(String[] args) {
        //syntax for array list---
        ArrayList<String> lastNames= new ArrayList<>();

        //toString is part of the ArrayList so you dont need to do toString.
        lastNames.add("Wallace");
        lastNames.add("Thompson");
        lastNames.add("smith");
        System.out.println(lastNames);

        // Java Array / add
        // String []lastNames2 = new String [10];
        // lastNames2 = Arrays.copyOf (lastNames2, lastNames2.length =1);
        //lastNames2[lastNames2.length -1] = "Wallace";

        //gives size of the element.
        System.out.println("the size of the lastNames arraylist is : " + lastNames.size() + "\n");

        //.get method example
        System.out.println("The element value returned will be wallace: "+ lastNames.get(0) + "\n");

        //using contains
        System.out.println("We are checking to see if wallace  is an element in the array list: "
                + lastNames.contains("Wallace") +"\n");

        // .remove method example: remove is case sensitive.
        System.out.println(lastNames);
        lastNames.remove(0);
        lastNames.remove("Smith");
        System.out.println(lastNames);

        // .isEmpty

        System.out.println(lastNames.isEmpty());// false

        //.lastIndexOf want last index of array but dont know it.
        System.out.println(lastNames.lastIndexOf("Thompson"));

        // first index of element

        System.out.println(lastNames.indexOf("Thompson"));
        System.out.println(lastNames);


        //syntax for creating a hash map:
        HashMap<String, String> usernames= new HashMap<>();

        usernames.put("Ryan", "ryanorsinger");
        usernames.put("Zach", "zgulde");
        usernames.put("Fernando", "fmendozaro");
        usernames.put("Justin", "jreich5");

        System.out.println("4 usernames:" + usernames + "\n");

        //.get method

        System.out.println(usernames.get("Ryan")); // "ryanorsinger");; // "ryanorsinger"

        // get value that does not exist Returns Null
        System.out.println(usernames.get("Mary")); // "ryanorsinger");; // "ryanorsinger"

        //.getOrDefault Method example
        System.out.println(" this method will return a default value instead of null:" + usernames.getOrDefault
                ("mary","noUsername"));

        //getOrDefault method does not set key or value
        System.out.println("maryhas not been added to usernames:" + usernames + "\n");

        //.putIfAbsent if value is missing example 1

        usernames.putIfAbsent("mary", " replacement value");
        System.out.println("if the key is not a hash map, this method will set it:" +usernames + "\n");

        //.putIfAbsent() method example 2
        usernames.putIfAbsent("Justin", "replacement value");
        System.out.println("this method will not overwrite current/existing values:" + usernames + "\n");

        //.contains can be used for key and value. Checking to see if a key or value is in hashmat
        System.out.println("checking fo keys where the value contains the default or replacement value" +
             usernames.containsValue("replacement value") +" "+ "\n");

        //.replace
        usernames.replace("Mary", "marylee");
        System.out.println("replacing the default value from the previous method:" + usernames +"\n");

        //.remove method
        usernames.remove("mary");
        System.out.println("removing the key, Mary and the value:" + usernames + "\n");

        //. clear() method
        usernames.clear();
        System.out.println("returns the boolean true if has map is empty:" + usernames + "\n");

        //.isEmpty method
        usernames.isEmpty();
        System.out.println("Returns the boolean true if has map is empty:" + usernames.isEmpty());
    }
}
