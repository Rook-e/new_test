import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListExampleTest {

    static ListExample list = new ListExample();

    public ListExampleTest() {
    }

    @AfterAll
    public static void tearDownClass() {
        list = new ListExample();
    }

    @Test
    public void testAdd() {
        list.add("Amber");
        list.add("Barry");
        list.add("Candice");

        assertEquals("Amber", list.getList().get(0));
        assertEquals("Barry", list.getList().get(1));
        assertEquals("Candice", list.getList().get(2));
    }

    @Test
    public void testRemove() {
        list.remove("Amber");

        assertEquals(2, list.getList().size());
        assertEquals(false, list.find("Amber"));
    }

    @Test
    public void testFind() {
        assertTrue(list.find("Barry"));
    }
}