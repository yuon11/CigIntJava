package testthisplease;

public class Computations {
  public static int add(int a, int b) {
    return a + b;
  }

  public static double divide(double a, double b) {
    if (b == 0) throw new ArithmeticException("Division by zero");
    else return a / b;
  }

  public static double multiply(double a, double b) {
    return a * b;
  }
}
