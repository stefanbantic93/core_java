package com.academy.four;

public class FourDemo {
    public static void main(String[] args) {
        //TIP_PODATKA varijabla = VRIJEDNOST;
        int firstNumber = 23; // DECIMALNI zapis vrijednost
        System.out.println(firstNumber);
        int secondNumber = 0x1a; //HEKSADECIMALNI zapis vrijednost
        System.out.println(secondNumber);
        //26 binarno -> 16=2¨4  8=2¨3  2¨1=2    11010
        int thirdNumber = 0b11010; //BINARNI brojni siste
        System.out.println(thirdNumber);

        long creditCardNumber = 1234_5678_9191L;
        long hexNumber = 0xFF_EC;
    }
}
