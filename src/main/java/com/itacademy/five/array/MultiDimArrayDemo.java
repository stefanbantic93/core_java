package com.academy.five.array;

public class MultiDimArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Senaid";
        names[1] = "Milica";
        names[2] = "Elmir";
        // Herr      Frau        Her
        // Senaid    Milica      Elmir
        String[] names2 = {"Senaid", "Milica", "Elmir"};
        char slovo = 'w';
        //ukoliko su svi elementi [] iste dužine - matrici
        String[][] array = {
                {"Her", "Frau", "Her"},
                {"Senaid", "Milica", "Elmir"}
        };

        System.out.println(array[0][1] + " " + array[1][1]);
        System.out.println(array[0][0] + " " + array[1][0]);
        System.out.println(array.length); // 2
        System.out.println(array[0].length);// 3
        System.out.println(array[1].length);// 3
        System.out.println(array[0][2] +  " " + array[1][2]);
    }
}
