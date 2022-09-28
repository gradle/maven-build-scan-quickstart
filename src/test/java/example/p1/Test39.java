package example.p1;

import example.p0.Production12;
import example.util.Sleeper;

import org.junit.Assert;
import org.junit.Test;
import static example.util.Sleeper.sleep;
import static org.junit.Assert.assertEquals;

public class Test39 {
    Production39 objectUnderTest = new Production39();

    @Test
    public void testProperty0() throws Exception {
        Production12 value = new Production12();
        objectUnderTest.setProperty0(value);
        Assert.assertEquals(value, objectUnderTest.getProperty0());
        Sleeper.sleep();
    }

    @Test
    public void testProperty1() throws Exception {
        Production25 value = new Production25();
        objectUnderTest.setProperty1(value);
        assertEquals(value, objectUnderTest.getProperty1());
        Sleeper.sleep();
    }

    @Test
    public void testProperty2() throws Exception {
        Production38 value = new Production38();
        objectUnderTest.setProperty2(value);
        assertEquals(value, objectUnderTest.getProperty2());
        Sleeper.sleep();
    }

    @Test
    public void testProperty3() throws Exception {
        String value = "value";
        objectUnderTest.setProperty3(value);
        assertEquals(value, objectUnderTest.getProperty3());
        Sleeper.sleep();
    }

    @Test
    public void testProperty4() throws Exception {
        String value = "value";
        objectUnderTest.setProperty4(value);
        assertEquals(value, objectUnderTest.getProperty4());
        Sleeper.sleep();
    }

    @Test
    public void testProperty5() throws Exception {
        String value = "value";
        objectUnderTest.setProperty5(value);
        assertEquals(value, objectUnderTest.getProperty5());
        Sleeper.sleep();
    }

    @Test
    public void testProperty6() throws Exception {
        String value = "value";
        objectUnderTest.setProperty6(value);
        assertEquals(value, objectUnderTest.getProperty6());
        Sleeper.sleep();
    }

    @Test
    public void testProperty7() throws Exception {
        String value = "value";
        objectUnderTest.setProperty7(value);
        assertEquals(value, objectUnderTest.getProperty7());
        Sleeper.sleep();
    }

    @Test
    public void testProperty8() throws Exception {
        String value = "value";
        objectUnderTest.setProperty8(value);
        assertEquals(value, objectUnderTest.getProperty8());
        Sleeper.sleep();
    }

    @Test
    public void testProperty9() throws Exception {
        String value = "value";
        objectUnderTest.setProperty9(value);
        assertEquals(value, objectUnderTest.getProperty9());
        Sleeper.sleep();
    }

}
