package school;

public class School {
  public static void main(String[] args) {
    Student fred = new Student("Fred", 3.2);
    fred.name = "";
    fred.gpa = 100; // changes creating invalid state!!!
  }
}
