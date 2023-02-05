package edu.craptocraft.tarjetausuario;

public class TarjetaUsuario implements Autenticacion {

    private final String id;
    private boolean activada;

    public TarjetaUsuario(String id, boolean activada) {
        this.id = id;
        this.activada = activada;
    }

    @Override
    public boolean isActivada() {
        return this.activada;
    }
    public void setActivada(boolean set){
        this.activada = set;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(this.id);
        return sb.toString();
    }
}
