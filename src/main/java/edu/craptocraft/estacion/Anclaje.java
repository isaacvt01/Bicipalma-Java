package edu.craptocraft.estacion;

import edu.craptocraft.bicicleta.Movil;

public class Anclaje {
    private boolean ocupado;
    private Movil bici;

    public Anclaje(boolean ocupado, Movil bici) {
        this.ocupado = ocupado;
        this.bici = bici;
    }
    public boolean isOcupado(){
        return this.ocupado;
    }
    public Movil getBici(){
        return this.bici;
    }
    public void anclarBici(Movil bici){
        this.bici = bici;
        this.ocupado = true;
    }
}
