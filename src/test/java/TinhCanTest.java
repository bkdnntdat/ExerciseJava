import org.junit.Assert;
import org.junit.Test;

public class TinhCanTest {
    @Test
    public void test_sqrt(){
        Assert.assertEquals(new TinhCan().sqrt(8.0), 2.828427125, 0.00001);
    }
}
