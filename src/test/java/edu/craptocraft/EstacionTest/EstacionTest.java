package edu.craptocraft.EstacionTest;

import edu.craptocraft.bicicleta.Bicicleta;
import edu.craptocraft.estacion.Anclaje;
import edu.craptocraft.estacion.Anclajes;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EstacionTest {
    Estacion estacion;
    Anclajes anclajes;
    Anclaje anclaje;
    Bicicleta bic;
    @BeforeClass
    public static void inicializar(){
        estacion= new Estacion (1, "Manacor", 6);
        anclajes = new Anclajes(9);
        anclaje = new Anclaje();
        bic = new Bicicleta(898);
    }
    @Test
    public void contructorTest(){
        // Se prueba el contructor con el método toString ya que los getters de esta clase son privados.
        String stringEstacion = estacion.toString();
        String esperado = 'id: 1\ndireccion: Manacor\nnumeroAnclajes: 6';
        Assert.assertEquals(esperado, stringEstacion);

    }


}


