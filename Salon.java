/**
 * clase que guarda los datos de los salones y la cola de espera al validar las reservas
 */
public class Salon{
    private int numero;
    private int capacidad;
    private int costo;
    private String tamano;
    private Evento[] eventos;

    //Metodos
    /**
     * Constructor personalizado de la clase
     */
    public Salon(){
        
    }

    public Salon(int numero, int capacidad, int costo, String tamano, Evento[] eventos){
        this.numero = numero;
        this.capacidad = capacidad;
        this.costo = costo;
        this.tamano = tamano;
        this.eventos = eventos;
    }
    
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

    public Evento[] getEvento(Evento[] eventos){
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
        this.eventos = eventos;
    }


    public String toString() {
        return "El numero es "+numero+" la capacidad es "+capacidad+" el costo es "+costo+" y el tamaño es"+tamano;
    }

}