package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExampleTest {

    @Test
    void testJoin() {
        assertEquals("1 2 3", Example.join("1", "2", "3"), "Joined string didn't match");
    }

}
