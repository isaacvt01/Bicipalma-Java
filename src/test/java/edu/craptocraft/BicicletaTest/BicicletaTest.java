package edu.craptocraft.BicicletaTest;
import org.junit.*;
import bicicleta.*;

public class BicicletaTest {
    @Test
    public void contructorTest(){
        Bicicleta bic = new Bicicleta(444);
        Assert.assertEquals(444, bic.getId());
    }
}
