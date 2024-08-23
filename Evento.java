/**
 * Clase que guarda los datos de los eventos que buscan realizar una reserva
 */

import java.util.Date;
public class Evento{
    private String tipo;
    private String encargado;
    private String nombre;
    private Date fecha_inicio;
    private Date fecha_fin;
    private Salon salon;
    private Boolean aprobado;

//METODOS   

    /**
     * Constructor predeterminado de la clase
     */
    public Evento(){       
    }

    /**
     * 
     * @param tipo tipo de evento a asignar [VIP o no] 
     */
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    /**
     * 
     * @return tipo de evento
     */
    public String getTipo(){
        return tipo;
    }

    /**
     * 
     * @param encargado nombre del encargado del evento a asignar
     */
    public void setEncargado(String encargado){
        this.encargado = encargado;
    }

    /**
     * 
     * @return nombre del encargado del evento
     */
    public String getEncargado(){
        return encargado;
    }

    /**
     * 
     * @param nombre nombre del evento a asignar
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    /**
     * 
     * @return nombre del evento
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * 
     * @param fecha_inicio inicio del evento, hora y dia, a asignar
     */
    public void setFecha_inicio(Date fecha_inicio){
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * 
     * @return inicio del evento, hora y dia
     */
    public Date getFecha_inicio(){
        return fecha_fin;
    }

    /**
     * 
     * @param fecha_fin fin del evento, hora y dia, a asignar
     */
    public void setFecha_fin(Date fecha_fin){
        this.fecha_fin = fecha_fin;
    }

    /**
     * 
     * @return fin del evento, hora y dia
     */
    public Date getFecha_fin(){
        return fecha_fin;
    }

    /**
     * 
     * @param Salon Salon que se asigna al evento
     */
    public void setSalon(Salon Salon){
        this.Salon = Salon;
    }

    /**
     * 
     * @return Salon donde realizar el evento
     */
    public Salon getSalon(){
        return salon;
    }

    /**
     * 
     * @param aprobado Determinacion de si el salon si puede ser reservado 
     */
    public void setAprobado(Boolean aprobado){
        this.aprobado = aprobado;
    }

    /**
     * 
     * @return aprobacion o rechazo de la reserva
     */
    public Boolean getAprobado(){
        return aprobado;
    }
    
    /**
     * @return mensaje con todos los datos del evento
     */
    public String toString(){
        return "\nTipo: " + tipo + 
        "\nEncargado: " + encargado +
        "\nNombre: " + nombre +
        "\nInicio: " + fecha_inicio +
        "\nFin: " + fecha_fin + 
        "\nSalon: " + salon +
        "\nAprobado" + aprobado;
    }
}