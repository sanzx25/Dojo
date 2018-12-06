package hu.dojo;

import jdk.Exported;
import junitparams.JUnitParamsRunner;
import junitparams.NamedParameters;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class PolidromTest {

    Polidrom underTest;

    @Before
    public void setUp() {
        underTest = new Polidrom();
    }

    @NamedParameters("returnWrongTestDatas")
    private Object[] returnWrongTestDatas() {
        return new Object[] {
                "Alma","alma","Peti","-1", "5x", "55x","Abba"
        };
    }

    @NamedParameters("testCorrectValues")
    private Object[] testCorrectValues() {
        return new Object[] {
                "abba", "ABBA", "gezaKeKazeg", "1","---","bob"
        };
    }

    @Test
    @Parameters(method = "testCorrectValues")
    public void testCorrectValuesVersion1(String testDara) {
        Boolean retval = underTest.isPalindrome(testDara);
        assertEquals( true, retval);
    }

    @Test
    @Parameters(method = "returnWrongTestDatas")
    public void testWithWrongValuesVersion1(String testDara) {
        Boolean retval = underTest.isPalindrome(testDara);
        assertEquals( false, retval);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithWrongValuesTrowIllegalArgumentExceptionWithEmptyParameterVersion1() {
        Boolean retval = underTest.isPalindrome("");
        assertEquals( false, retval);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithWrongValuesTrowIllegalArgumentExceptionWithNullParameterVersion1() {
        Boolean retval = underTest.isPalindrome(null);
        assertEquals( false, retval);
    }


    @Test
    @Parameters(method = "testCorrectValues")
    public void testCorrectValuesVersion2(String testDara) {
        Boolean retval = underTest.isPalindrome2(testDara);
        assertEquals( true, retval);
    }

    @Test
    @Parameters(method = "returnWrongTestDatas")
    public void testWithWrongValuesVersion2(String testDara) {
        Boolean retval = underTest.isPalindrome2(testDara);
        assertEquals( false, retval);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testWithWrongValuesTrowIllegalArgumentExceptionWithEmptyParameterVersion2() {
        Boolean retval = underTest.isPalindrome2("");
        assertEquals( false, retval);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithWrongValuesTrowIllegalArgumentExceptionWithNullParameterVersion2() {
        Boolean retval = underTest.isPalindrome2(null);
        assertEquals( false, retval);
    }



}
