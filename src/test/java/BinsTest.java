import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinsTest {

//    returns # of 10's in the 10 bin for example
    @Test
    public void testGetBin() {
        //Given
        int bin = 0;
        Bins fun = new Bins(1, 5);

        //When
        int numberOfThingsInBin = fun.getBin(5);

        //Then
        Assert.assertEquals(bin, numberOfThingsInBin);
    }

    //Increases bin #10
    @Test
    public void testIncrementBin() {
        //Given
        int binContent = 5;
        Bins test = new Bins(1,10);

        //When
        int bin = 5;
        test.incrementBin(bin);


        Assert.assertEquals(bin, binContent);
    }


}