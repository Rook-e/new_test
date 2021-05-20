import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CollectionExampleTest {
    static CollectionExample collection = new CollectionExample();

    public CollectionExampleTest() {
    }

    @AfterAll
    static void tearDown() {
        collection = new CollectionExample();
    }

    @Test
    public void testAdd() {

        collection.add("A");
        collection.add("B");
        collection.add("C");

        assertEquals("A", collection.getLetters().toArray()[0]);
        assertEquals("B", collection.getLetters().toArray()[1]);
        assertEquals("C", collection.getLetters().toArray()[2]);

    }

    @Test
    public void testRemove() {

        collection.remove("C");

        assertEquals(2, collection.getLetters().size());
        assertEquals(false, collection.find("C"));
    }

    @Test
    public void testFind() {
        assertTrue(collection.find("A"));
    }

}