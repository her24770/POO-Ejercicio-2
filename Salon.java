

public class Salon{
    private int numero;
    private int capacidad;
    private int costo;
    private String tamano;
    private Evento[] eventos;

    //Metodos
    public Salon(){
        this.numero = numero;
        this.capacidad = capacidad;
        this.costo = costo;
        this.tamano = tamano;
    }
    
    //Gets de los atributos

    /**
     * @return valor variable numero
     */
    public int getNumero(){
        return numero;
    }

    /**
     * @return valor variable capacidad
     */
    public int getCapacidad(){
        return capacidad;
    }

    /**
     * @return valor variable costo
     */
    public int getCosto(){
        return costo;
    }

    /**
     * @return valor variable tamano
     */
    public String getTamano(){
        return tamano;
    }

    public Evento getEvento(Evento[] eventos){
        return eventos;
    }

    //Sets de los Atributos

    /**
     * @param numero asigna valor variable numero
     */
    public void setNumero(int numero){
        this.numero = numero;
    }

    /**
     * @param capacidad asigna valor variable capacidad
     */
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    /**
     * @param costo asigna valor variable costo
     */
    public void setCosto(int costo){
        this.costo = costo;
    }

    /**
     * @param tamano asigna valor variable tamano
     */
    public void setTamano(String tamano){
        this.tamano = tamano;
    }

    public void setEvento(Evento[] eventos){

    }

    public String toString() {
        return "El numero es "+numero+" la capacidad es "+capacidad+" el costo es "+costo+" y el tamaño es"+tamano;
    }

}