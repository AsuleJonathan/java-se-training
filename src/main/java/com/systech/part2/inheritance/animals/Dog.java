package com.systech.part2.inheritance.animals;

public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public char[] printName() {
        return null;
    }

}