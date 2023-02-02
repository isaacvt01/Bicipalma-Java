package edu.craptocraft.BicicletaTest;
import org.junit.*;
import edu.craptocraft.bicicleta.*;

public class BicicletaTest {
    @Test
    public void contructorTest(){
        Bicicleta bic = new Bicicleta(444);
        Assert.assertEquals(444, bic.getId());
    }
    @Test
    public  void toStringTest(){
        Bicicleta bic = new Bicicleta(888);
        String actual = "888";
        Assert.assertEquals(actual, bic.toString());
    }
}
