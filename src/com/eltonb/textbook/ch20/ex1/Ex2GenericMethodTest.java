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
public class Ex2GenericMethodTest {
   
    public static void main(String[] args) {
        // create arrays of Integer, Double and Character
        Integer[] integerArray = {1, 2, 3, 4, 5, 6};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        Student[] studentArray = {new Student(1, "ADVANCED", "JAVA"), new Student(2, "advanced", "java")};

        System.out.print("Array integerArray contains:\n");
        printArray(integerArray); // pass an Integer array 
        System.out.printf("%nArray doubleArray contains:\n");
        printArray(doubleArray); // pass a Double array
        System.out.printf("%nArray characterArray contains:\n");
        printArray(characterArray); // pass a Character array
        System.out.print("Array studentArray contains:\n");
        printArray(studentArray); // pass an Integer array
    }

    // generic method printArray
    public static <T> void printArray(T[] inputArray) {
        // display array elements
        for (T element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    }

    /*
    public static void printArray(Object[] inputArray) {
        // display array elements
        for (Object element : inputArray)
            System.out.printf("%s ", element);

        System.out.println();
    } 
*/
}
