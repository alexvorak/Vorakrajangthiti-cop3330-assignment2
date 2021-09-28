package Ex24;

import org.junit.Assert;
import org.junit.Test;
public class AnagramCheckerTest {

    @Test
    public void main() throws RuntimeException {
       String first = "abcdef";
       String second = new String(first);
       Assert.assertTrue(first.equals(second));
       Assert.assertFalse(first == second);
       Assert.assertEquals(first,second);

    }
}