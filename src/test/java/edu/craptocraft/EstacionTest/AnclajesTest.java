package edu.craptocraft.EstacionTest;

import edu.craptocraft.bicicleta.Bicicleta;
import edu.craptocraft.estacion.Anclaje;
import edu.craptocraft.estacion.Anclajes;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnclajesTest {
    public static Anclajes anclajes;
    public static Anclaje anclaje;

    public static Bicicleta bic;
    @BeforeClass
    public static void inicializarAnclajes(){
        anclajes = new Anclajes(9);
        anclaje = new Anclaje();
        bic = new Bicicleta(898);
    }
    @Test
    public void ConstructorAnclajesTest() {
        Assert.assertEquals(9, anclajes.numAnclajes());

    }
    @Test
    public void crearAnclajesTest(){
        for (int i = 0; i<anclajes.numAnclajes(); i++) {
            Assert.assertEquals(anclajes.getAnclaje(i).getClass(), anclaje.getClass());
        }
    }

    @Test
    public void ocuparAnclajeTest(){
        anclajes.ocuparAnclaje(1, bic);
        Assert.assertTrue(anclajes.getAnclaje(1).isOcupado());
    }
    @Test
    public void liberarAnclajeTest(){
        anclajes.ocuparAnclaje(1, bic);
        Assert.assertTrue(anclajes.getAnclaje(1).isOcupado());
        anclajes.liberarAnclaje(1);
        Assert.assertFalse(anclajes.getAnclaje(1).isOcupado());
    }
    @Test
    public void getBiciAt(){
        anclajes.ocuparAnclaje(1, bic);
        Assert.assertEquals(bic, anclajes.getBiciAt(1));
    }
    @Test
    public void isAnclajeOcupado(){
        anclajes.ocuparAnclaje(1, bic);
        Assert.assertTrue(anclajes.isAnclajeOcupado(1));
        Assert.assertFalse(anclajes.isAnclajeOcupado(0));
    }
}
