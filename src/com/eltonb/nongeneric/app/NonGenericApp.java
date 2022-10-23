package com.eltonb.nongeneric.app;

import com.eltonb.generic.AJList;
import com.eltonb.generic.AJListIterator;
import com.eltonb.generic.AJSingleLinkedList;
import com.eltonb.nongeneric.ints.IntegerList;
import com.eltonb.nongeneric.ints.IntegerListIterator;
import com.eltonb.nongeneric.ints.IntegerSingleLinkedList;
import com.eltonb.nongeneric.strings.StringList;
import com.eltonb.nongeneric.strings.StringListIterator;
import com.eltonb.nongeneric.strings.StringSingleLinkedList;

public class NonGenericApp {

    public static void main(String[] args) {
        NonGenericApp app = new NonGenericApp();
        app.playWithIntegers();
        //app.playWithStrings();
    }

    private void playWithStrings() {
        StringList strings = new StringSingleLinkedList();
        strings.add("zero");
        strings.add("one");
        strings.add("two");
        strings.add("three");
        strings.add("four");

        display(strings);
        strings.remove(0);
        display(strings);
        strings.remove(2);
        display(strings);
        strings.remove(2);
        display(strings);
        strings.remove(0);
        display(strings);
        strings.remove(0);
        display(strings);

        //will throw an exception
        strings.remove(0);
        display(strings);
    }

    private void playWithIntegers() {
        IntegerList integers = new IntegerSingleLinkedList();
        for (int i = 0; i < 5; i++) {
            integers.add(i);
        }

        display(integers);
        integers.remove(0);
        display(integers);
        integers.remove(2);
        display(integers);
        integers.remove(2);
        display(integers);
        integers.remove(0);
        display(integers);
        integers.remove(0);
        display(integers);

        //will throw an exception
        integers.remove(0);
        display(integers);
    }

    private void display(IntegerList ints) {
        StringBuilder sb = new StringBuilder("List contains: ");
        IntegerListIterator it = ints.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    private void display(StringList strings) {
        StringBuilder sb = new StringBuilder("List contains: ");
        StringListIterator it = strings.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }

}
