import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimulationTest {
    @Test
    public void testSimulationCons() {
        Simulation test = new Simulation(2, 10);
        Integer ans = 2;
        Integer howMany = test.howManyDice;
        Assert.assertEquals(howMany, ans);

    }

}