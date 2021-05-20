import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapExampleTest {
    static MapExample map = new MapExample();

    public MapExampleTest() {
    }

    @AfterAll
    public static void tearDownClass() {
        map = new MapExample();
    }

    @Test
    public void testAdd() {
        map.getMap().put(1, "Nike");
        map.getMap().put(2, "Adidas");
        map.getMap().put(3, "Apple");

        assertEquals(3, map.getMap().size());
    }

    @Test
    public void testRemove() {
        map.remove(1);

        assertEquals(2, map.getMap().size());
        assertEquals(false, (map.find("Nike")));
    }

    @Test
    public void testFind() {

        assertTrue(map.find("Apple"));
    }

}