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
        int idBici = anclaje.getBici().getId();
        Assert.assertEquals(444, idBici);
        Assert.assertFalse(anclaje.isOcupado());
    }
    @Test
    public void anclarBiciTest(){
        Movil bic = new Bicicleta(444);
        Anclaje anclaje = new Anclaje(false,bic );
        anclaje.anclajarBici(bic);
        Assert.assertTrue(anclaje.isOcupado());
    }
}
