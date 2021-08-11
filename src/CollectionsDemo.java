import java.util.ArrayList;

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


    }
}
