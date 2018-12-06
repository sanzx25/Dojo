package hu.dojo;

import junitparams.JUnitParamsRunner;
import junitparams.NamedParameters;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Set;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class LottoTest {

    Lotto underTest;

    @Before
    public void setUp() {
        underTest = new Lotto();
    }


    @NamedParameters("returnWrongTestDatas")
    private Object[] returnWrongTestDatas() {
        return new Object[]{
                new Object[]{1, 1, 1},
                new Object[]{2, 2, 2},
                new Object[]{100, 100, 100},
                new Object[]{-1, 50, 10},
                new Object[]{1, 10, 11},
                new Object[]{10, 4, 2},
                new Object[]{1000, 1001, 2},
                new Object[]{1, 91, 91},
                new Object[]{1, 100, -1},
                new Object[]{1, 50, -1},
                new Object[]{1, 50, 0},
                new Object[]{0, 50, 3},
                new Object[]{1, -1, 3}
        };
    }

    @NamedParameters("returnCorrectTestDatas")
    private Object[] returnCorrectTestDatas() {
        return new Object[]{
                new Object[]{1, 5, 2},
                new Object[]{2, 6, 2},
                new Object[]{100, 110, 2},
                new Object[]{1, 50, 3},
                new Object[]{1, 4, 3},
                new Object[]{1, 100, 6},
                new Object[]{100, 200, 15},
                new Object[]{20, 30, 10},
                new Object[]{3, 11, 5},
                new Object[]{1, 55, 12},
                new Object[]{1, 91, 90}
        };
    }

    @Test
    @Parameters(method = "returnCorrectTestDatas")
    public void testCorrectValues(Integer from, Integer to, Integer count) {
        Set<Integer> retval = underTest.generate(from, to, count);
        assertEquals(retval.size(), Integer.parseInt(count.toString()));
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "returnWrongTestDatas")
    public void testWithWrongValues(Integer from, Integer to, Integer count) {
        underTest.generate(from, to, count);
    }

    @Test
    @Parameters(method = "returnCorrectTestDatas")
    public void testCorrectValuesMethod2(Integer from, Integer to, Integer count) {
        Set<Integer> retval = underTest.generate2(from, to, count);
        assertEquals(retval.size(), Integer.parseInt(count.toString()));
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "returnWrongTestDatas")
    public void testWithWrongValuesMethod2(Integer from, Integer to, Integer count) {
        underTest.generate2(from, to, count);
    }

    @Test
    @Parameters(method = "returnCorrectTestDatas")
    public void testCorrectValuesMethod3(Integer from, Integer to, Integer count) {
        Set<Integer> retval = underTest.generate3(from, to, count);
        assertEquals(retval.size(), Integer.parseInt(count.toString()));
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "returnWrongTestDatas")
    public void testWithWrongValuesMethod3(Integer from, Integer to, Integer count) {
        underTest.generate3(from, to, count);
    }


    @Test
    @Parameters(method = "returnCorrectTestDatas")
    public void testCorrectValuesMethod4(Integer from, Integer to, Integer count) {
        Set<Integer> retval = underTest.generate4(from, to, count);
        assertEquals(retval.size(), Integer.parseInt(count.toString()));
    }

    @Test(expected = IllegalArgumentException.class)
    @Parameters(method = "returnWrongTestDatas")
    public void testWithWrongValuesMethod4(Integer from, Integer to, Integer count) {
        underTest.generate4(from, to, count);
    }
}
