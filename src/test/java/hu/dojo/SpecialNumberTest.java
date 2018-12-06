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
public class SpecialNumberTest {

    SpecialNumber underTest;

    @Before
    public void setUp() {
        underTest = new SpecialNumber();
    }

    @NamedParameters("returnCorrectTestDatas")
    private Object[] returnCorrectTestDatas() {
        return new Object[] {
                new Object[] { 11111, 5},
                new Object[] { 2, 2},
                new Object[] { 100, 1},
                new Object[] { 150, 6},
                new Object[] { 92, 2},
                new Object[] { 1109, 2},
                new Object[] { 12345, 6},
                new Object[] { 2030, 5},
                new Object[] { 31146, 6},
                new Object[] { 1551, 3},
                new Object[] { 191, 2}
        };
    }

    @Test
    @Parameters(method = "returnCorrectTestDatas")
    public void testCorrectValuesVersion1(Integer number,Integer acceptedValue) {
        int retval = underTest.specialSum(number);
        assertEquals((Integer) retval, acceptedValue);
    }

    @Test
    @Parameters(method = "returnCorrectTestDatas")
    public void testCorrectValuesVersion2(Integer number,Integer acceptedValue) {
        int retval = underTest.specialSum2(number);
        assertEquals((Integer) retval, acceptedValue);
    }

    @Test
    @Parameters(method = "returnCorrectTestDatas")
    public void testCorrectValuesVersion3(Integer number,Integer acceptedValue) {
        int retval = underTest.specialSum3(number);
        assertEquals((Integer) retval, acceptedValue);
    }

}
