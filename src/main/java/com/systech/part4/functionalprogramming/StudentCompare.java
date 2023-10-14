package com.systech.part4.functionalprogramming;

@FunctionalInterface
public interface StudentCompare {
    boolean compare(Student studentOne, Student studentTwo);
}
