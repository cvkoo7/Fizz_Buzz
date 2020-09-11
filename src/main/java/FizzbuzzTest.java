import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTest {
    @Test
    public void test(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("1",fizzBuzz.action(1));
    }
}

