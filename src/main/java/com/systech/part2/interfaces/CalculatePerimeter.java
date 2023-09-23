package com.systech.part2.interfaces;

public interface CalculatePerimeter {
    double calculatePerimeter(double x, double y);
    default double sum (int a, int b) {
        return 0;
    }

}
