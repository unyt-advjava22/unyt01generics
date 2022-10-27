package com.eltonb.textbook.ch20.ex2;

// Fig. 20.7: Stack.java
// Stack generic class declaration.
import java.util.ArrayList;

public class Stack<T> implements IStack <T>  {
    private final ArrayList<T> elements; 

    public Stack() {
      this(10); // default stack size
    } 


    public Stack(int capacity) {
        int initCapacity = capacity > 0 ? capacity : 10; // validate
        elements = new ArrayList<T>(initCapacity); // create ArrayList
    }

    @Override
    public void push(T pushValue) {
      elements.add(pushValue); // place pushValue on Stack
    } 

    @Override
    public T pop() throws EmptyStackException {
        if (elements.isEmpty()) // if stack is empty
            throw new EmptyStackException("Stack is empty, cannot pop");

        // remove and return top element of Stack
        return elements.remove(elements.size() - 1); 
    }

    @Override
    public void push(T ... values) {
        if (values == null)
            throw new IllegalArgumentException("Null array");
        
        for (T value : values) 
            push(value);
    }
} 

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/