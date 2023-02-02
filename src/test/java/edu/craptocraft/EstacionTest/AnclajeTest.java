package edu.craptocraft.EstacionTest;
import edu.craptocraft.bicicleta.Bicicleta;
import edu.craptocraft.bicicleta.Movil;
import edu.craptocraft.estacion.Anclaje;
import org.junit.Assert;
import org.junit.Test;

public class AnclajeTest {
    @Test
    public void constructorTest(){
        Movil bic = new Bicicleta(444);
        Anclaje anclaje = new Anclaje(false,bic );
        Assert.assertEquals(444, anclaje.getBici());
        Assert.assertEquals(false, anclaje.isOcupado());
    }
}
