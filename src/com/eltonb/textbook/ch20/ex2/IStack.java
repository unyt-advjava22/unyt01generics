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

public interface IStack<T> {
    public void push(T value);
    public void push(T ... values);
    public T pop() throws EmptyStackException;
}
