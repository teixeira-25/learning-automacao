import org.junit.Assert;
import org.junit.Test;

public class JUnitTest
{
    @Test
    public void test()
    {
        boolean x = 1 + 1 == 2;
        Assert.assertTrue(x);
    }
}
