package edu.craptocraft.EstacionTest;
import edu.craptocraft.bicicleta.Bicicleta;
import edu.craptocraft.bicicleta.Movil;
import edu.craptocraft.estacion.Anclaje;
import org.junit.Assert;
import org.junit.Test;

public class AnclajeTest {
    @Test
    public void anclarBiciTest(){
        Movil bic = new Bicicleta(444);
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(bic);
        Assert.assertTrue(anclaje.isOcupado());
    }
    @Test
    public void liberarBici(){
        Movil bic = new Bicicleta(444);
        Anclaje anclaje = new Anclaje();
        anclaje.anclarBici(bic);
        anclaje.liberarBici();
        Assert.assertFalse(anclaje.isOcupado());
    }
    @Test
    public void toStringTest(){
        Anclaje anclaje = new Anclaje();
        String resultadoEsperado = "¿El anclaje está ocupado? false";
        Assert.assertEquals(resultadoEsperado, anclaje.toString());
    }
}
