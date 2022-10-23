package com.eltonb.generic.app;

import com.eltonb.generic.AJList;
import com.eltonb.generic.AJListIterator;
import com.eltonb.generic.AJSingleLinkedList;
import com.eltonb.nongeneric.ints.IntegerList;
import com.eltonb.nongeneric.ints.IntegerListIterator;
import com.eltonb.nongeneric.ints.IntegerSingleLinkedList;
import com.eltonb.nongeneric.strings.StringList;
import com.eltonb.nongeneric.strings.StringListIterator;
import com.eltonb.nongeneric.strings.StringSingleLinkedList;

public class GenericApp {

    public static void main(String[] args) {
        GenericApp app = new GenericApp();
        app.playWithIntegers();
        //app.playWithStrings();
    }

    private void playWithIntegers() {
        AJList<Integer> integers = new AJSingleLinkedList<>();
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

    private void playWithStrings() {
        AJList<String> strings = new AJSingleLinkedList<>();
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

    private <T> void display(AJList<T> list) {
        StringBuilder sb = new StringBuilder("List contains: ");
        AJListIterator<T> it = list.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }


}
