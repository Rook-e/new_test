import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetExampleTest {
    static SetExample set = new SetExample();

    public SetExampleTest() {
    }


    @AfterAll
    public static void tearDownClass() {
        set = new SetExample();
    }

    @Test
    public void testAdd() {
        set.add("apple");
        set.add("thesis");
        set.add("banana");

        assertEquals(3, set.getSet().size());
    }

    @Test
    public void testRemove() {
        set.remove("banana");

        assertEquals(2, set.getSet().size());
        assertEquals(false, set.find("banana"));
    }

    @Test
    public void testFind() {

        assertTrue(set.find("apple"));
    }

}