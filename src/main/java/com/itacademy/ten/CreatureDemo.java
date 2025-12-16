package com.academy.ten;

import com.academy.ten.animal.*;
import com.academy.ten.human.Employee;
import com.academy.ten.human.Pensioner;
import com.academy.ten.human.Professor;
import com.academy.ten.human.Student;

import java.time.LocalDate;

/**
 * DRY - Don't Repeat Yourself
 * <></>
 * <p>
 * SOLID
 * <p>
 * S - Single Responsibility
 * O - Open/Close
 * L - Liskov Substitution Principle
 * I - Inversion Of Control
 * D - Dependency Inversion
 * </p>
 * O - Open Close Principle. Kad smo jedno dizajnirali klasu ona je ZATVORENA/CLOSED for MODIFICATION
 * Open For EXTENSION
 */
public class CreatureDemo {
    public static void main(String[] args) {
        Student student = new Student("Kristijan", "Birkić", LocalDate.now(), "KB13445");
        Dog dog = new Dog("Pas Lesi");
        Cat cat = new Cat("Pas Cicko");
        student.setAnimal(dog);
        System.out.println(student.getName()+" ima " + student.getAnimal().getName());
        student.setAnimal(cat);
        System.out.println(student.getName()+" ima " + student.getAnimal().getName());
        student.setAnimal(new Hamster("Hrčak Hrčko"));
        System.out.println(student.getName()+" ima " + student.getAnimal().getName());
        student.setAnimal(new Fish("Ribica Zlatna"));
        System.out.println(student.getName()+" ima " + student.getAnimal().getName());
        student.setAnimal(new Sheep("Ovca Peggy"));
        System.out.println(student.getName()+" ima " + student.getAnimal().getName());
        Pensioner pensioner = new Pensioner("Aleksandar", "Petković", LocalDate.now(), 2500.0);
        pensioner.setAnimal(dog);
        Employee employee = new Employee("Stefan", "Bantić", LocalDate.now(), 15000.0);
        employee.setAnimal(dog);
        Professor professor = new Professor("Milica", "Ivan", LocalDate.now());
        professor.setAnimal(dog);
    }
}
