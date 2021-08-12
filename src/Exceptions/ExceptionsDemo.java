package Exceptions;
import util.Input;

public class ExceptionsDemo {

    public static void foo() throws Exception{
        throw new Exception("Hey something  bad happened !");
    }
    public static void main(String[] args)   {
//


//        int[] myArray = {1, 2, 3, 4, 5};
//        System.out.println(myArray[5]); Will give an error  because 5 is out of bound.
//        try {
//            Input input = new Input();
////            throw new RuntimeException("Hola");
//
//            System.out.println("Enter an int: ");
//            input.getInt();
//            int result = 1 / 0;
//        } catch (ArithmeticException e) {
//            System.out.println("ouch runtime exception.");
////            e.printStackTrace();
//
//        } catch (RuntimeException e){
////        throw new RuntimeException("hi there");//When this alone is run it will throw the hi there
//        System.out.println(" Dont divide by zero!");
//
//    }finally
//
//    {
//        System.out.println("finally is exexcuting");
//    }
//    System.out.println("end of program");
        try {
            foo();
        }catch (Exception e){
            System.out.println("error" + e.getMessage());
        }
        System.out.println("end of program.");
}
}
