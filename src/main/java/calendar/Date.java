package calendar;

public class Date {
  int day;
  int month;
  int year;

  // isThisALeapYear year

  // howManyDaysInThisMonth month, year

  // get this by default if ZERO coded "initializers"
  // called "constructors"
//  public Date() {}

  // "new" creates an object of this type, fills it with zeroes
  // then calls this initializer (constructor) and passes the
  // newly created object into the constructor as a hidden/implicit
  // argument called this.
  public Date(/*Date this, */int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
}

class BreakADate {
  public static void main(String[] args) {
//    Date d = new Date(); // INVALID 0, 0, 0
    Date d = new Date(28, 2, 2022);
//    d.day = 31;
//    d.month = 2;
//    d.year = 2020;
    System.out.println(d.day);
  }
}