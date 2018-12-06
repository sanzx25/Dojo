package hu.dojo;

import junitparams.JUnitParamsRunner;
import junitparams.NamedParameters;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzPlusTest {

    private static String FIZZ = "Fizz";
    private static String BUZZ = "Buzz";
    private static String FIZZBUZZ = "FizzBuzz";
    private static String EMPTY = "";
    FizzBuzzPlus underTest;

    @Before
    public void setUp() {
        underTest = new FizzBuzzPlus();
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
                new Object[]{13, FIZZ},
                new Object[]{23, FIZZ},
                new Object[]{30, FIZZ},
                new Object[]{31, FIZZ},
                new Object[]{32, FIZZ},
                new Object[]{33, FIZZ},
                new Object[]{34, FIZZ},
                new Object[]{35, FIZZ},
                new Object[]{36, FIZZ},
                new Object[]{37, FIZZ},
                new Object[]{38, FIZZ},
                new Object[]{39, FIZZ},
                new Object[]{43, FIZZ},
                new Object[]{53, FIZZ},
                new Object[]{63, FIZZ},
                new Object[]{73, FIZZ},
                new Object[]{83, FIZZ},
                new Object[]{93, FIZZ},
                new Object[]{45, FIZZ},
                new Object[]{46, EMPTY},
                new Object[]{60, FIZZ},
                new Object[]{61, EMPTY},
                new Object[]{62, EMPTY},
                new Object[]{64, EMPTY},
                new Object[]{65, EMPTY},
                new Object[]{66, FIZZ},
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
                new Object[]{10, BUZZ},
                new Object[]{15, BUZZ},
                new Object[]{20, BUZZ},
                new Object[]{25, BUZZ},
                new Object[]{30, BUZZ},
                new Object[]{35, BUZZ},
                new Object[]{40, BUZZ},
                new Object[]{45, BUZZ},
                new Object[]{50, BUZZ},
                new Object[]{51, BUZZ},
                new Object[]{52, BUZZ},
                new Object[]{53, BUZZ},
                new Object[]{54, BUZZ},
                new Object[]{55, BUZZ},
                new Object[]{56, BUZZ},
                new Object[]{57, BUZZ},
                new Object[]{58, BUZZ},
                new Object[]{59, BUZZ},
                new Object[]{60, BUZZ},
                new Object[]{65, BUZZ},
                new Object[]{70, BUZZ},
                new Object[]{75, BUZZ},
                new Object[]{80, BUZZ},
                new Object[]{85, BUZZ},
                new Object[]{90, BUZZ},
                new Object[]{95, BUZZ},
                new Object[]{46, EMPTY},
                new Object[]{41, EMPTY},
                new Object[]{44, EMPTY},
                new Object[]{47, EMPTY},
                new Object[]{49, EMPTY},
                new Object[]{88, EMPTY},
                new Object[]{89, EMPTY},
                new Object[]{74, EMPTY},
                new Object[]{47, EMPTY}

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
                new Object[]{31, FIZZ},
                new Object[]{32, FIZZ},
                new Object[]{33, FIZZ},
                new Object[]{34, FIZZ},
                new Object[]{35, FIZZBUZZ},
                new Object[]{36, FIZZ},
                new Object[]{37, FIZZ},
                new Object[]{38, FIZZ},
                new Object[]{39, FIZZ},
                new Object[]{40, BUZZ},
                new Object[]{45, FIZZBUZZ},
                new Object[]{46, "46"},
                new Object[]{50, BUZZ},
                new Object[]{51, FIZZBUZZ},
                new Object[]{52, BUZZ},
                new Object[]{53, FIZZBUZZ},
                new Object[]{54, FIZZBUZZ},
                new Object[]{55, BUZZ},
                new Object[]{56, BUZZ},
                new Object[]{57, FIZZBUZZ},
                new Object[]{58, BUZZ},
                new Object[]{59, BUZZ},
                new Object[]{35, FIZZBUZZ},
                new Object[]{60, FIZZBUZZ},
                new Object[]{63, FIZZ},
                new Object[]{65, BUZZ},
                new Object[]{66, FIZZ},

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
        String retval = underTest.testFizzPlussBuzz2(testedNumber);
        assertEquals(acceptedValue, retval);
    }

    @Test
    @Parameters(method = "testFizzBuzzFunctionality")
    public void testFizzBuzzFunctionality3(int testedNumber, String acceptedValue) {
        String retval = underTest.testFizzPlussBuzz3(testedNumber);
        assertEquals(acceptedValue, retval);
    }
}
