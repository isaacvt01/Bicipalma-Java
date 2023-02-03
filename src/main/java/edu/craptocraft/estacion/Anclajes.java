package edu.craptocraft.estacion;

import edu.craptocraft.bicicleta.Movil;

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
        if (!anclajes[posicion].isOcupado()){
            this.anclajes[posicion].anclarBici(bici);
        }
        else{
            System.out.println("Anclaje ocupado");
        }
    }


}
