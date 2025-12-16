package com.academy.seven.question;

/**
 * Kako radi StringBuilder ?
 *
 * String interpretacija ?
 *
 *
 */
public class Question2 {
    public static void main(String[] args) {
        //proste
        int number = 23;
        //složene -> String ali ? ponaša se nekada kao primitive
//        int[] numbers = new int[3];
        //Kao i svaki drugi složeni tip HEAP
//        String name1 = new String("Milica").intern(); // van Spring Pool m1
        String name1 = "Milica"; // String Pool m2
        //String literal
        String name2 = "Milica"; // String Pool m2

        System.out.println(name1.equals(name2));
        int hashCode1 = name1.hashCode();
        System.out.println(hashCode1);
        int hashCode2 = name2.hashCode();
        System.out.println(hashCode2);
        System.out.println(name1 == name2);
    }
}
