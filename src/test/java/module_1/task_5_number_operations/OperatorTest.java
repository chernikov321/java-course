package module_1.task_5_number_operations;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OperatorTest {

    Operator operator = new Operator();

    @Test
    public void testMultiply() {
        Assertions.assertEquals(10, operator.multiply(5, 2));
        Assertions.assertEquals(10, operator.multiply(2, 5));
        Assertions.assertEquals(12, operator.multiply(3, 4));
        Assertions.assertEquals(0, operator.multiply(99999, 0));
        Assertions.assertEquals(0, operator.multiply(0, 0));
        Assertions.assertEquals(81, operator.multiply(9, 9));
        Assertions.assertEquals(81, operator.multiply(-9, -9));
        Assertions.assertEquals(-81, operator.multiply(-9, 9));
    }
    @Test
    public void testDivide() {
        Assertions.assertEquals(10, operator.divide(100, 10));
        Assertions.assertEquals(-10, operator.divide(100, -10));

        Assertions.assertDoesNotThrow(() -> operator.divide(0, 10));
        Assertions.assertThrows(Throwable.class, () -> operator.divide(10, 0));
    }

    @Test
    public void testSum() {
        Assertions.assertEquals(10, operator.sum(5, 5));
        Assertions.assertEquals(30, operator.sum(10, 20));
        Assertions.assertEquals(30, operator.sum(20, 10));
        Assertions.assertEquals(0, operator.sum(-5, 5));
        Assertions.assertEquals(0, operator.sum(0, 0));
    }

    @Test
    public void testSubtract() {
        Assertions.assertEquals(0, operator.subtract(5, 5));
        Assertions.assertEquals(-10, operator.subtract(10, 20));
        Assertions.assertEquals(10, operator.subtract(20, 10));
        Assertions.assertEquals(-10, operator.subtract(-5, 5));
        Assertions.assertEquals(0, operator.subtract(0, 0));
    }
}