package edu.craptocraft.estacion;

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


}
