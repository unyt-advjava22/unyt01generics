/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.textbook.ch20.ex1;

import java.util.Iterator;
import java.util.List;

public class Ex1OverLoadedMethods {
    
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

        System.out.printf("Array integerArray contains:%n");
        printArray(integerArray); // pass an Integer array
        System.out.printf("%nArray doubleArray contains:%n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:%n");
        printArray(characterArray); // pass a Character array
    } 

    // method printArray to print Integer array
    public static void printArray(Integer[] inputArray) {
        // display array elements
        for (Integer element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }
    // method printArray to print Double array
    public static void printArray(Double[] inputArray) {
        // display array elements
        for (Double element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }

    // method printArray to print Character array
    public static void printArray(Character[] inputArray) {
        // display array elements
        for (Character element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }    

}