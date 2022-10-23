/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eltonb.textbook.ch20.ex2;

/**
 *
 * @author elton.ballhysa
 */
public class Pair<F, S> {
    private F first;
    private S second;
    
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }
    
    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }    
    
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair("String", 12);
        //Pair<String, Integer> pair = Pair.of("String", 12);
        System.out.println("pair.first = " + pair.getFirst());
        System.out.println("pair.second= " + pair.getSecond());
    }
}
