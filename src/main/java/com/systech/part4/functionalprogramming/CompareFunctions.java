package com.systech.part4.functionalprogramming;

@FunctionalInterface
public interface CompareFunctions<T,P,R> {
    R compare(T t, P p);
}
