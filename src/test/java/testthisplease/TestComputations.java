package testthisplease;

import org.junit.Assert;
import org.junit.Test;

public class TestComputations {
  @Test
  public void testAddition() {
    // set it up like this:
    int arg1 = 99;
    int arg2 = 101;

    // do this to it:
    int result = Computations.add(arg1, arg2);

    // it should respond like this:
//    if (result != 200) {
//      throw new Exception("That's the wrong answer: " + result);
//    }
    Assert.assertEquals("99 + 101 should produce 200", 200, result);
  }

  @Test
  public void testMultiplication() {
    // set up like this
    double pi = 3.14;
    double two = 2.0;

    // do this to it
    double result = Computations.multiply(pi, 2);

    // should get this result
    Assert.assertEquals("tau should be 6.28", 6.28, result, 0.000001);
  }

  @Test
  public void testNormalDivision() {
    Assert.assertEquals("8 / 4 should be 2", 2.0,
        Computations.divide(8, 4), 0.00001);
  }

  @Test(expected = ArithmeticException.class)
  public void testDivisionByZero() {
    Computations.divide(8, 0);
  }
}
