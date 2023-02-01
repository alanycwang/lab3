import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

class AChecker implements StringChecker {
    public boolean checkString(String s) {
        return (s.charAt(0) == 'a');
    }
}

public class ListTests {

	@Test 
	public void testFilter() {
        StringChecker sc = new AChecker();
        ArrayList<String> test1 = new ArrayList<String>();
        test1.add("a");
        test1.add("laksdjf");
        test1.add("aljkwjes");
        ArrayList<String> ans1 = new ArrayList<String>();
        ans1.add("a");
        ans1.add("aljkwjes");
        assertTrue(ans1.equals(ListExamples.filter(test1, sc)));
        
	}

    @Test
    public void testFilter2() {
        StringChecker sc = new AChecker();
        ArrayList<String> test1 = new ArrayList<String>();
        test1.add("a");
        test1.add("laksdjf");
        test1.add("a");
        ArrayList<String> ans1 = new ArrayList<String>();
        ans1.add("a");
        ans1.add("a");
        assertTrue(ans1.equals(ListExamples.filter(test1, sc)));
    }

    @Test
    public void testMerge() {
        ArrayList<String> test1 = new ArrayList<String>();
        test1.add("a");
        test1.add("b");
        test1.add("z");
        ArrayList<String> test2 = new ArrayList<String>();
        test2.add("c");
        test2.add("zkldsjf");
        ArrayList<String> ans = new ArrayList<String>();
        ans.add("a");
        ans.add("b");
        ans.add("c");
        ans.add("z");
        ans.add("zkldsjf");
        assertTrue(ans.equals(ListExamples.merge(test1, test2)));
    }
}
