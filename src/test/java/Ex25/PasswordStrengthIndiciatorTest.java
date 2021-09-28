package Ex25;

import org.junit.Test;
import org.junit.Assert;

public class PasswordStrengthIndiciatorTest {
@Test
    public void main() throws RuntimeException {
        String first = "abcdef";
        String second = new String(first);
        Assert.assertTrue(first.equals(second));
        Assert.assertFalse(first == second);
        Assert.assertEquals(first,second);

    }
}