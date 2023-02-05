package edu.craptocraft.estacion;

import edu.craptocraft.bicicleta.Movil;

import java.util.Random;

public class Anclajes {

    private final Anclaje[] anclajes;

    public Anclajes(int numAnclajes) {
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes(){
        for (int i = 0; i<this.numAnclajes(); i++){
            this.anclajes[i] = new Anclaje();
        }
    }


    public Anclaje[] anclajes() {
        return this.anclajes;
    }
    public int numAnclajes(){
        return this.anclajes.length;
    }
    public Anclaje getAnclaje(int posicion){
        return this.anclajes[posicion];
    }

    public void ocuparAnclaje(int posicion, Movil bici){
        if (!isAnclajeOcupado(posicion)){
            this.anclajes[posicion].anclarBici(bici);
        }
        else{
            ;
        }
    }
    public Movil getBiciAt(int posicion){
        return this.anclajes[posicion].getBici();
    }

    public void liberarAnclaje(int posicion){
        if (isAnclajeOcupado(posicion)){
            this.anclajes[posicion].liberarBici();
        }
        else{
            ;
        }
    }
    public boolean isAnclajeOcupado(int posicion){
        return this.anclajes[posicion].isOcupado();
    }
    public int seleccionarAnclaje(){
        Random random = new Random();
        int anclajeRandom = random.nextInt(numAnclajes());
        return anclajeRandom;
    }


}
