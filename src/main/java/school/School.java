package school;

public class School {
  public static void main(String[] args) {
    Student fred = null;
//    System.out.println(fred.gpa);
    fred = new Student("Fred", 3.2);
    fred.name = "";
    fred.gpa = 100; // changes creating invalid state!!!

    try {
      Student jim = new Student("", 0.1);
    } catch (IllegalArgumentException ie) {
      System.out.println("Ooops, that doesn't seem to work");
    }
    System.out.println("Program still running!");
  }
}
