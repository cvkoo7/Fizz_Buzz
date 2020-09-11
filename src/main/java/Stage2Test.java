import org.junit.Assert;
import org.junit.Test;

public class Stage2Test {
    @Test
    public void test() {
        Stage2 fizzBuzz = new Stage2();
        Assert.assertEquals("1",fizzBuzz.action(1));
        Assert.assertEquals("2",fizzBuzz.action(2));
        Assert.assertEquals("Fizz",fizzBuzz.action(3));
    }
}