package com.eltonb.textbook.ch20.ex1;

public class Student extends Object implements Comparable<Student> {
    private int id;
    private String name;
    private String surname;

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString()  {
        return id + ": " + name + " " + surname;
    }

    @Override
    public int compareTo(Student other) {
        return this.surname.compareTo(other.surname);
    }
}
