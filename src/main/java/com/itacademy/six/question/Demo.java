package com.academy.six.question;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//switch-case-break
public class Demo {
    public static void main(String[] args) {
        // U čemu je razlika između if-else vs switch
        int number = new Scanner(System.in).nextInt();
        boolean equalTo23 = number == 23;
        //if konstrukt kao input/ulazni prima samo BOOLEAN true/false
        if (equalTo23) {
            System.out.println("To je taj..");
        } else if (number == 1) {
            System.out.println("Ovo je broj 1");
        } else if (number == 34) {
            System.out.println("Ovo je 34");
        } else {
            System.out.println("Unknown number");
        }

        //switch konstrukt kao input/ulazni parm prima INT ili nešto konvertibilno u int
        switch (number) {
            case 1:
                System.out.println("Ovo je broj 1");
                break;
            case 34:
                System.out.println("Ovo je 34");
                break;
            case 23:
                System.out.println("To je taj..");
                break;
            default:
                System.out.println("Unknown number");
                break;
        }

    }
}
