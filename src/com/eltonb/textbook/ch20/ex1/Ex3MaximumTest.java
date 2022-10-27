/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.textbook.ch20.ex1;

/**
 *
 * @author elton.ballhysa
 */
public class Ex3MaximumTest {
    
    public static void main(String[] args) {
        String t;
        System.out.printf("Maximum of %d, %d and %d is %d%n%n", 3, 4, 5, maximum(3, 4, 5));
        System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f%n%n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
        System.out.printf("Maximum of %s, %s and %s is %s%n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));
        System.out.println(maximum(
                new Student(1, "John", "Doe"),
                new Student(2, "Jane", "Doe"),
                new Student(3, "xyz", "abc")));
    }

    /*
    // determines the largest of three Comparable objects
    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x; // assume x is initially the largest 

        if (y.compareTo(max) > 0)
            max = y; // y is the largest so far

        if (z.compareTo(max) > 0)
            max = z; // z is the largest

        return max; // returns the largest object
    }
    */

    public static <T extends Comparable<T>> T maximum(T ... values) {
        if (values == null || values.length == 0)
            throw new IllegalArgumentException("No input values");
        
        T max = values[0];
        for (int i= 1; i<values.length; i++)
            max = max.compareTo(values[i]) >= 0 ? max : values[i];
        return max;
    }
    
    /*
    public static Comparable maximum(Comparable ... values) {
        if (values == null || values.length == 0)
            throw new IllegalArgumentException("No input values");
        
        Comparable max = values[0];
        for (int i= 1; i<values.length; i++)
            max = max.compareTo(values[i]) > 0 ? max : values[i];
        return max;
    }
*/
}
