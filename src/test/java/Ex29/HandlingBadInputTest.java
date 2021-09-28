package Ex29;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HandlingBadInputTest {

    @Test
    public void main() throws RuntimeException {
        String first = "abcdef";
        String second = new String(first);
        Assert.assertTrue(first.equals(second));
        Assert.assertFalse(first == second);
        Assert.assertEquals(first,second);

    }
}