package edu.craptocraft.EstacionTest;

import edu.craptocraft.estacion.Anclajes;
import org.junit.Assert;
import org.junit.Test;

public class AnclajesTest {
    @Test
    public void ConstructorAnclajes() {
        Anclajes anclajes = new Anclajes(9);
        Assert.assertEquals(9, anclajes.numAnclajes());
    }
}
