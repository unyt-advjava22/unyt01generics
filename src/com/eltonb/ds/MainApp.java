package com.eltonb.ds;

import com.eltonb.Main;

public class MainApp {

    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.go();
    }

    private void go() {
        //AJSortedSet<Integer> ss = new SortedArraySet<>();
        AJSortedSet<Integer> ss = new SortedBSTreeSet<>();
        ss.add(25);
        ss.add(15);
        ss.add(12);
        ss.add(17);
        ss.add(9);
        ss.add(18);
        ss.add(11);
        System.out.println("size is " + ss.size());
        display(ss);
        ss.add(11);
        System.out.println("11 contained? " + ss.contains(11));
        System.out.println("101 contained? " + ss.contains(101));
        System.out.println("after adding duplicate value");
        System.out.println("size is " + ss.size());
        display(ss);
    }

    private <T extends Comparable<T>>  void display(AJSortedSet<T> ss) {
        for (T val : ss)
            System.out.print(val + " ");
        System.out.println();
    }
}
