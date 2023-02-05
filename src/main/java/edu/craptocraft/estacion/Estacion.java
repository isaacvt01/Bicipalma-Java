package edu.craptocraft.estacion;

import edu.craptocraft.bicicleta.Movil;
import edu.craptocraft.tarjetausuario.Autenticacion;

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

    private void mostrarAnclaje(Movil bic, int numeroAnclaje){
        numeroAnclaje += 1;
        System.out.println("Bicicleta: " +bic.getId() + "anclada en el anclaje: " + numeroAnclaje);
    }

    public void anclarBicicleta(Movil bic){
        boolean isAnclada = false;
        int i = 0;
        while (!isAnclada){
            if(!this.anclajes.getAnclaje(i).isOcupado()){
                this.anclajes.getAnclaje(i).anclarBici(bic);
                isAnclada = true;
                mostrarAnclaje(bic, i);
            }else{
                ;
            }
            i++;
        }
    }

    public int anclajesLibres(){
        int contadorLibres = 0;
        for (int i=0; i<anclajes.numAnclajes(); i++){
            if (!this.anclajes.getAnclaje(i).isOcupado()){
                contadorLibres += 1;
            }
            else {
                ;
            }
        }
        return contadorLibres;
    }

    public boolean leerTarjetaUsuario(Autenticacion tarjeta){
        return tarjeta.isActivada();
    }

    public void mostrarBicicleta(Movil bic, int numAnclaje){
        numAnclaje += 1;
        System.out.println("bicicleta retirada: " + bic.getId() + "del anclaje: " + numAnclaje);
    }
    public void retirarBicicleta(Autenticacion tarjetaUsuario){
        if(leerTarjetaUsuario(tarjetaUsuario)){
            boolean isRetirada = false;
            while(!isRetirada){
                int anclaje = this.anclajes.seleccionarAnclaje();
                if(this.anclajes.isAnclajeOcupado(anclaje)){
                    mostrarBicicleta(this.anclajes.getBiciAt(anclaje), anclaje);
                    this.anclajes.liberarAnclaje(anclaje);
                    isRetirada = true;
                }else{
                    ;
                }
            }
        }
    }

}
