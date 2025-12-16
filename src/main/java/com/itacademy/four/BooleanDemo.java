package com.academy.four;

import java.util.Scanner;

public class BooleanDemo {
    public static void main(String[] args) {
        System.out.println("Hej zdravo. Upiši omiljeni broj");
        int omiljeniBroj = new Scanner(System.in).nextInt();
        boolean condition = omiljeniBroj==23;//true ili false

        if(condition){
            System.out.println("Zadovoljio si..");
        }else{
            System.out.println("Nisi zadoboljio..");
        }
    }
}
