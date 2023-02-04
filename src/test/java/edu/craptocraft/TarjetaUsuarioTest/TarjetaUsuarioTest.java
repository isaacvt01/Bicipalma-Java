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
    }
}
