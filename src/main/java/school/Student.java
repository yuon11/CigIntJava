package school;

//import java.util.*; // not considered good style

//import java.lang.System;

import static java.lang.System.out;

public class Student {
  String name;
  double gpa;

  public Student(String name, double gpa) {
//    if (!isValid(name, gpa)) // logical inverse
    if (isValid(name, gpa)) {
      this.name = name;
      this.gpa = gpa;
    } else {
//      this.name = "unknown";
//      this.gpa = 0.0; // unnecessary!
      throw new IllegalArgumentException("Bad name or gpa for Student");
    }
  }

  // expressions of Object type (anything except the
  // 8 primitives:
  // boolean byte short char int long float double
  // are ALWAYS "references" (very similar to pointers)
  // they tell you where to find the data
  // we have the special "where" value null -- which
  // indicates "there is no value"
  public static boolean isValid(String name, double gpa) {
    return gpa >= 0.0 && gpa <= 5.0
        && name != null && name.length() > 0;
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

/*
1) create validity check for your student
2) create a constructor that checks validity
3) build enough code to verify that a valid student is made,
   and is initialized with good contents
4) build more code, so as to verify that an INVALID student
   blows up.
For those more comfortable.
5) add a try/catch structure to print a polite message about
   the invalid student and then carry on with execution
6) add methods to update the name, and the gpa (separate methods)
   and similarly validate the proposed change.
 */