package com.pratice;

public class LineComparison {
    public static void main (String[] args){
        // Point A
        double x1 = 1.0;
        double y1 = 2.0;
        // Point B
        double x2 = 4.0;
        double y2 = 6.0;
        // length of the line
        double length = calculateLineLength(x1, y1, x2, y2);
        //result
        System.out.println("The length of the line AB is: " + length);
    }
    // Function to calculate the length of a line
    private static double calculateLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}

