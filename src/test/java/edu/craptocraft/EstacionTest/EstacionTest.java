package edu.craptocraft.EstacionTest;

import edu.craptocraft.bicicleta.Bicicleta;
import edu.craptocraft.bicicleta.Movil;
import edu.craptocraft.estacion.Anclaje;
import edu.craptocraft.estacion.Anclajes;
import edu.craptocraft.estacion.Estacion;
import edu.craptocraft.tarjetausuario.TarjetaUsuario;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EstacionTest {
    static Estacion estacion;
    static Anclajes anclajes;
    static Anclaje anclaje;
    static Movil bic;

    static TarjetaUsuario tarjetaNoActivada;

    static TarjetaUsuario tarjeta;
    @BeforeClass
    public static void inicializar(){
        estacion= new Estacion (1, "Manacor", 6);
        anclajes = new Anclajes(9);
        anclaje = new Anclaje();
        bic = new Bicicleta(898);
        tarjeta = new TarjetaUsuario("222", true);
        tarjetaNoActivada = new TarjetaUsuario("333", false);
    }
    @Test
    public void contructorTest(){
        // Se prueba el contructor con el método toString ya que los getters de esta clase son privados.
        String stringEstacion = estacion.toString();
        String esperado = "ID: 1\nDireccion: Manacor\nNumero de anclajes: 6";
        Assert.assertEquals(esperado, stringEstacion);

    }
    @Test
    public void anclarBicicletaTest(){
        //En este test se prueban los métodos anclarBicicleta y anclajesLibres.
        estacion.anclarBicicleta(bic);
        Assert.assertEquals(estacion.anclajesLibres(), 5);
    }

    @Test
    public void leerTarjetaUsuarioTest(){
        Assert.assertTrue(estacion.leerTarjetaUsuario(tarjeta));
        tarjeta.setActivada(false);
        Assert.assertFalse(estacion.leerTarjetaUsuario(tarjeta));
    }
    @Test
    public void retirarBicicletaTest(){
        estacion.anclarBicicleta(bic);
        Assert.assertEquals(estacion.anclajesLibres(), 4);
        estacion.retirarBicicleta(tarjeta);
        Assert.assertEquals(estacion.anclajesLibres(), 5);
    }



}


