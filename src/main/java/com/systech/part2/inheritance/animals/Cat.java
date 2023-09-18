package com.systech.part2.inheritance.animals;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    public char[] printName() {
        return null;
    }
}