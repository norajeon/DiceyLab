import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.Test;


public class DiceTest {

//tosses n number of dice + adds them up
@Test
public void testTossAndSum() {
    //When
    Dice test = new Dice(2);
    int sum = test.tossAndSum();

    Assert.assertTrue(sum >= 2);
}

    @Test
    public void testDiceCons() {
        Dice test = new Dice(2);
        Integer ans = 2;
        Integer howMany = test.howManyDice;


        Assert.assertEquals(howMany, ans);
    }

}