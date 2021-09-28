package Ex26;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


class MonthsToPayCreditCardTest {

    @Test
    void main() throws RuntimeException {
        String first = "abcdef";
        String second = new String(first);
        Assert.assertTrue(first.equals(second));
        Assert.assertFalse(first == second);
        Assert.assertEquals(first,second);

    }
    }
