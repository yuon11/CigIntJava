package school;

//import java.util.*; // not considered good style

//import java.lang.System;

import static java.lang.System.out;

public class Student {
  String name;
  double gpa;

  public Student(String name, double gpa) {
    this.name = name;
    this.gpa = gpa;
  }

/*  public static void main(String[] args) {
    Student fred = new Student();
    fred.name = "Fred"; // double quotes makes a String literal
    fred.gpa = 3.2; // numbers with decimals etc. 1E+6 are double literals

    out.println(fred.name); // because of import static java.lang.System.out;
    System.out.println(fred.gpa);

  }*/
}

/*
class Oddball {
  public static void main(String[] args) {
    System.out.println("Hello ");
  }
}*/
