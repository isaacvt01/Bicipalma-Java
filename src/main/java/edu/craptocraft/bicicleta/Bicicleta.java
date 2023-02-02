package edu.craptocraft.bicicleta;

public class Bicicleta {

    private int id;

    public Bicicleta(int id) {
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.id);
        return sb.toString();
    }
}
