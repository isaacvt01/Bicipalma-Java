package edu.craptocraft.TarjetaUsuarioTest;

import edu.craptocraft.tarjetausuario.TarjetaUsuario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TarjetaUsuarioTest {
    static TarjetaUsuario tarjeta;

    @BeforeClass
    public static void inicializar(){
        tarjeta = new TarjetaUsuario("234", true);
    }
    @Test
    public void isactivadaTest(){
        Assert.assertTrue(tarjeta.isActivada());
        tarjeta.setActivada(false);
        Assert.assertFalse(tarjeta.isActivada());
    }
    @Test
    public void toStringTest(){
        String resultado = "234";
        String tarjetaString = tarjeta.toString();
        Assert.assertEquals(resultado, tarjetaString);

    }

}
