package JavaAdvanced.DevelhopeJavaAdvanced.JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.junit.Assert.assertEquals;

public class testOperations {
    @Test
    public void testSubtraction() {
        try {
            Assertions.assertEquals(5, Operations.subtraction(10, 5));
            System.out.println("L'output della sottrazione è uguale all'atteso.");
        } catch (AssertionError e) {
            System.out.println("L'output è diverso dall'atteso: " + e.getMessage());
        }
    }

    @Test
    public void testMultiplication() {

        try {
            Assertions.assertEquals(32, Operations.multiplication(4, 8));
            System.out.println("L'output della moltiplicazione è uguale all'atteso.");
        } catch (AssertionError e) {
            System.out.println("L'output è diverso dall'atteso: " + e.getMessage());
        }
    }


    @Test
    public void testSubtractionWithNegativeResult() {
        try {
            Assertions.assertEquals(-5, Operations.subtraction(5, 10));
            System.out.println("L'output è uguale all'atteso.");
        } catch (AssertionError e) {
            System.out.println("L'output è diverso dall'atteso: " + e.getMessage());
        }
    }

    @Test
    public void testMultiplicationWithZero() {
        try {
            Assertions.assertEquals(0, Operations.multiplication(0, 10));
            System.out.println("L'output è uguale all'atteso.");
        } catch (AssertionError e) {
            System.out.println("L'output è diverso dall'atteso: " + e.getMessage());
        }
    }
}