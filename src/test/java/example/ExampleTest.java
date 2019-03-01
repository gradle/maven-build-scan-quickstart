package example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void testJoin() {
        assertEquals("Joined string didn't match", "1 2 3", Example.join("1", "2", "3"));
    }

}
