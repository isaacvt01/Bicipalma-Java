package edu.craptocraft.estacion;

public class Estacion {
    private final int id;
    private final String direccion;

    private final Anclajes anclajes;

    public Estacion(int id, String direccion, int numAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.anclajes = new Anclajes(numAnclajes);
    }

    private int getId(){
        return this.id;
    }
    private String getDireccion(){
        return this.direccion;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(this.id).append("\nDireccion: ").append(this.direccion).append("\nNumero de anclajes: ").append(this.anclajes.numAnclajes());
        return sb.toString();
    }
    private Anclaje[] anclajes(){
        return this.anclajes.anclajes();
    }
    private int numAnclajes(){
        return this.anclajes.numAnclajes();
    }
    public void consultarEstacion(){
        System.out.println(this);
    }

}
