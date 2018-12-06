package hu.dojo;

import junitparams.JUnitParamsRunner;
import junitparams.NamedParameters;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Set;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String FIZZBUZZ = "FizzBuzz";
    private static String EMPTY = "";
    FizzBuzz underTest;

    @Before
    public void setUp() {
        underTest = new FizzBuzz();
    }

    @NamedParameters("testFizzFunctionality")
    private Object[] testFizzFunctionality() {
        return new Object[]{
                new Object[]{1, EMPTY},
                new Object[]{2, EMPTY},
                new Object[]{3, FIZZ},
                new Object[]{4, EMPTY},
                new Object[]{5, EMPTY},
                new Object[]{6, FIZZ},
                new Object[]{45, FIZZ},
                new Object[]{46, EMPTY},
                new Object[]{60, FIZZ}
        };
    }

    @NamedParameters("testBuzzFunctionality")
    private Object[] testBuzzFunctionality() {
        return new Object[]{
                new Object[]{1, EMPTY},
                new Object[]{2, EMPTY},
                new Object[]{3, EMPTY},
                new Object[]{4, EMPTY},
                new Object[]{5, BUZZ},
                new Object[]{6, EMPTY},
                new Object[]{45, BUZZ},
                new Object[]{46, EMPTY},
                new Object[]{60, BUZZ}
        };
    }

    @NamedParameters("testFizzBuzzFunctionality")
    private Object[] testFizzBuzzFunctionality() {
        return new Object[]{
                new Object[]{1, "1"},
                new Object[]{2, "2"},
                new Object[]{3, FIZZ},
                new Object[]{4, "4"},
                new Object[]{5, BUZZ},
                new Object[]{6, FIZZ},
                new Object[]{10, BUZZ},
                new Object[]{15, FIZZBUZZ},
                new Object[]{27, FIZZ},
                new Object[]{30, FIZZBUZZ},
                new Object[]{45, FIZZBUZZ},
                new Object[]{46, "46"},
                new Object[]{50, BUZZ},
                new Object[]{60, FIZZBUZZ}
        };
    }

    @Test
    @Parameters(method = "testFizzFunctionality")
    public void testFizzFunctionality(int testedNumber, String acceptedValue) {
        String retval = underTest.isFizz(testedNumber);
        assertEquals(acceptedValue, retval);
    }

    @Test
    @Parameters(method = "testBuzzFunctionality")
    public void testBuzzFunctionality(int testedNumber, String acceptedValue) {
        String retval = underTest.isBuzz(testedNumber);
        assertEquals(acceptedValue, retval);
    }

    @Test
    @Parameters(method = "testFizzBuzzFunctionality")
    public void testFizzBuzzFunctionality(int testedNumber, String acceptedValue) {
        String retval = underTest.testFizzBuzz(testedNumber);
        assertEquals(acceptedValue, retval);
    }

    @Test
    @Parameters(method = "testFizzBuzzFunctionality")
    public void testFizzBuzzFunctionality2(int testedNumber, String acceptedValue) {
        String retval = underTest.testFizzBuzz2(testedNumber);
        assertEquals(acceptedValue, retval);
    }
}
