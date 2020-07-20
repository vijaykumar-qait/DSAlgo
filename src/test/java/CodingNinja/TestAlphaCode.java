package CodingNinja;

import CodingNinja.BacktrackingDynamicProgramming.AlphaCodeDP;
import org.junit.Assert;
import org.junit.Test;

public class TestAlphaCode {
    /**
     * Falling for cases:
     * 25114   -> 6
     * 1111111111   -> 89
     * 3333333333   -> 1
     * 123112563    -> 15
     * 12345654321346864   -> 9
     * 301 -> 0
     * 1020 -> 1
     * 2002 -> 0 this is not working
     * 201 -> 1
     * 3020 -> 0
     * 0
     * */

    @Test
    public void VerifyFor_25114(){
        Assert.assertEquals("25114 ouput is wrong", 6, AlphaCodeDP.countAlphaCode("25114"));
    }

    @Test
    public void VerifyFor_1111111111(){
        Assert.assertEquals("1111111111 ouput is wrong", 89, AlphaCodeDP.countAlphaCode("1111111111"));
    }

    @Test
    public void VerifyFor_12345654321346864(){
        Assert.assertEquals("12345654321346864 ouput is wrong", 9, AlphaCodeDP.countAlphaCode("12345654321346864"));
    }

    @Test
    public void VerifyFor_301(){
        Assert.assertEquals("301 ouput is wrong", 0, AlphaCodeDP.countAlphaCode("301"));
    }

    @Test
    public void VerifyFor_1020(){
        Assert.assertEquals("1020 ouput is wrong", 1, AlphaCodeDP.countAlphaCode("1020"));
    }

    @Test
    public void VerifyFor_2002(){
        Assert.assertEquals("2002 ouput is wrong", 0, AlphaCodeDP.countAlphaCode("2002"));
    }

    @Test
    public void VerifyFor_201(){
        Assert.assertEquals("201 ouput is wrong", 1, AlphaCodeDP.countAlphaCode("201"));
    }

    @Test
    public void VerifyFor_3020(){
        Assert.assertEquals("3020 ouput is wrong", 0, AlphaCodeDP.countAlphaCode("3020"));
    }
}
