import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LinkedListTests {

    LinkedList listEmpty;
    LinkedList listWithInt;

	@Before
    public void setup() {
        listEmpty = new LinkedList();
        listWithInt = new LinkedList();
        listWithInt.append(5);
    }

    @Test
    public void testPrepend() {
        listEmpty.prepend(5);
        assertEquals(5, listEmpty.root.value);
        listWithInt.prepend(2);
        assertEquals(2, listWithInt.root.value);
        assertEquals(5, listWithInt.root.next.value);
    }

    @Test
    public void testAppend() {
        listEmpty.append(5);
        assertEquals(5, listEmpty.root.value);
        listWithInt.append(2);
        assertEquals(5, listWithInt.root.value);
        assertEquals(2, listWithInt.root.next.value);
    }

    @Test
    public void testFirst() {
        assertEquals(5, listWithInt.first());
    }

    @Test
    public void testLast() {
        listWithInt.append(4);
        listWithInt.append(3);
        assertEquals(3, listWithInt.last());
        listWithInt.append(2);
        assertEquals(2, listWithInt.last());
    }

    @Test
    public void testToString() {
        listWithInt.append(4);
        listWithInt.append(3);
        assertEquals("5 4 3", listWithInt.toString());
    }

    @Test
    public void testlength() {
        listWithInt.append(4);
        listWithInt.append(3);
        assertEquals(3, listWithInt.length());
    }
}
