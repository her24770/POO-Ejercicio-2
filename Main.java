import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

/**
 * @author Josue Hernandez 24770, Juan Daniel Ordoñez 24979, Gabriel Hidalgo 24939
 * Creación: 23-08-2024
 * Ultima actualización: 28-08-2024
 */
public class Main{
   
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        List<Salon> salones = new ArrayList<>();
        List<Evento> eventos = new ArrayList<>();
        List<String> eventosPosibles = List.of("Conferencia internacional", "Boda", "Gala", "XV años", "Convivio", "Reunión de trabajo", "Bautizo");//Los primeros 3 eventos son VIP
        List<String> eventosVIP = eventosPosibles.subList(0, 3);

        System.err.println("Bienvenido");

        //Agregar 4 salones
        for (int i = 0; i<4; i++){
            System.out.println("\n--------NUEVO SALON-------\n");
                    Salon newsalon = new Salon(); 

                    System.out.print("Ingrese el numero del salon : ");
                    int po = Integer.parseInt(scn.nextLine());

                    boolean find = true;
                    //Valida que no se repita el numero
                    while (find) {
                        find=false;
                        for (Salon salon : salones) {
                            if (salon.getNumero() == po) find = true;
                        }
                        if (!find) {
                            newsalon.setNumero(po);
                        } else {
                            System.out.println("Este número de salón ya existe, elija otro:");
                            po = Integer.parseInt(scn.nextLine());
                        }
                    }
                    //Menu
                    int r = 0;
                    int op;
                    while(r == 0){
                        System.out.println("Seleccione el tamaño del salon");
                        System.out.println("         1. Grande");
                        System.out.println("         2. Mediano");
                        System.out.println("         3. Pequeño");
                        op = Integer.parseInt(scn.nextLine());
                        if(op > 3  || op < 1){
                            System.out.println("\nOpcion invalida, eliga un numero entre el 1 al 3"); //Valida la opcion
                        }
                        else{
                            switch (op) {
                                case 1:
                                    newsalon.setTamano("Grande");
                                    break;
                                case 2:
                                    newsalon.setTamano("Mediano");
                                    break;
                                case 3:
                                    newsalon.setTamano("Pequeño");
                                    break;
                    
                                default:
                                    break;
                            }

                            r = r+1;

                            System.out.println("\nIngrese la capacidad del salon");
                            newsalon.setCapacidad(Integer.parseInt(scn.nextLine())); //Agrega capacidad
                    
                            System.out.println("\nIngrese el costo del salon");
                            newsalon.setCosto(Integer.parseInt(scn.nextLine()));//Agrega costo
                    
                            salones.add(newsalon);
                        }}
        }

        Boolean repeatMenu=true;
        //Menu General
        while(repeatMenu){
            
            System.out.println("MENU");
            System.out.println("1. Ingresar un nuevo salon : ");
            System.out.println("2. Realizar una reservación :");
            System.out.println("3. Aprovar una reservacion :");
            System.out.println("4. Lista de eventos");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opcion : ");
            String optionMenu = scn.nextLine();
            switch (optionMenu) {
                case "1": //Agregar otro salon
                    System.out.println("Ingresar un salon");
                    Salon newsalon = new Salon(); 

                    System.out.print("Ingrese el numero del salon : ");
                    int po = Integer.parseInt(scn.nextLine());

                    boolean find = true;
                    //valida la existencia del numero
                    while (find) {
                        find=false;
                        for (Salon salon : salones) {
                            if (salon.getNumero() == po) find = true;
                        }
                        if (!find) {
                            newsalon.setNumero(po);
                        } else {
                            System.out.println("Este número de salón ya existe, elija otro:");
                            po = Integer.parseInt(scn.nextLine());
                        }
                    }
                    //Menu de salon nuevo
                    int r = 0;
                    int op;
                    while(r == 0){
                        System.out.println("Seleccione el tamaño del salon");
                        System.out.println("         1. Grande");
                        System.out.println("         2. Mediano");
                        System.out.println("         3. Pequeño");
                        op = Integer.parseInt(scn.nextLine());
                        if(op > 3  || op < 1){
                            System.out.println("Opcion invalida, eliga un numero entre el 1 al 3");
                        }
                        else{
                            switch (op) {
                                case 1:
                                    newsalon.setTamano("Grande");
                                    break;
                                case 2:
                                    newsalon.setTamano("Mediano");
                                    break;
                                case 3:
                                    newsalon.setTamano("Pequeño");
                                    break;
                    
                                default:
                                    break;
                            }

                            r = r+1;

                            System.out.println("Ingrese la capacidad del salon");
                            newsalon.setCapacidad(Integer.parseInt(scn.nextLine()));
                    
                            System.out.println("Ingrese el costo del salon");
                            newsalon.setCosto(Integer.parseInt(scn.nextLine()));
                    
                            salones.add(newsalon);
                        }}
                    break;

            
                case "2": //Peticion de reserva
                    System.out.println("Realizar una reservacion");
                    Evento evento = new Evento();

                    Boolean typeExists = false;
                    //Valida que el tipo exista en la lista
                    while(!typeExists){
                        for (int i=0; i<eventosPosibles.size(); i++){
                            System.out.print(i+1 + "    " + eventosPosibles.get(i) + "\n");
                        }

                        System.out.print("\nSelecccione un tipo de Evento: ");
                        int Ntipo = Integer.parseInt(scn.nextLine()); 
                        //Valida existencia de tipo
                        if (Ntipo < eventosPosibles.size()+1){
                            evento.setTipo(eventosPosibles.get(Ntipo-1)); //Agrega el tipo a su atributo
                            typeExists = true;
                        }
                        else{
                            System.out.println("\n\n>>>>>No existe esa opcion\n");
                        }
                    }
        
                    System.out.print("\nIngrese el nombre del evento: "); //Agreaga el nombre al evento
                    evento.setNombre(scn.nextLine());

                    System.out.print("\nIngrese el nombre del encargado: ");
                    evento.setEncargado(scn.nextLine()); //agrega al atributo encargado

       
                    Boolean valido = true;
                    while (valido){
                        System.out.print("\nIngrese la fecha de inicio del evento (dd-MM-yyyy HH:mm): ");
                        String fecha = scn.nextLine(); 
    
                        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm"); //formato de fecha
                        formato.setLenient(false);
                        //Valida que el formato sea correcto
                        try {
                            Date fecha_inicio = formato.parse(fecha);
                            evento.setFecha_inicio(fecha_inicio);
                            valido = false;

                        } catch (ParseException e){
                            System.out.print("\n>>>>Formato de fecha invalido");
                        }
                    }

                    System.out.print("\nIngrese la duracion en horas del evento: ");
                    //Creacion de calendar para hora
                    Calendar horas = Calendar.getInstance();
                    horas.setTime(evento.getFecha_inicio());

                    horas.add(Calendar.HOUR_OF_DAY, Integer.parseInt(scn.nextLine())); //Suma las horas al inicial

                    Date fechaFin = horas.getTime();
                    evento.setFecha_fin(fechaFin); //Agrega al atributo fecha_fin

                    Boolean salonExists = false;
                    //Elegir salon
                    while(!salonExists){
                        //Lista los salones existentes
                        for ( int i = 0; i<salones.size(); i++) {
                            System.out.print(i+1 + "    " + salones.get(i).toString() + "\n");
                        }

                        System.out.print("\nIngrese el numero de salon que quiere reservar: ");
                        int opcion = Integer.parseInt(scn.nextLine());
                        //Validacion de tamano y VIP
                        if (salones.get(opcion-1).getTamano() != "Grande"){
                            System.out.print(salones.get(opcion-1).getTamano());
                            evento.setSalon(salones.get(opcion-1));
                            salonExists=true;
                        }else{
                            //Validaciones al elegir el Grande
                            Boolean repeat = true;
                            for(int i=0; i<eventosVIP.size(); i++){

                                if(evento.getTipo().equals(eventosVIP.get(i))){
                                evento.setSalon(salones.get(opcion-1));
                                    salonExists = true;
                                    repeat=false;
                                }
                            }
                            if(repeat){
                                System.out.println("\n>>> El evento '"+evento.getTipo()+"' no esta disponible para salones Grandes");
                            }
                        }
                        //Actualizar la lista de espera del salon 
                        Salon updateSalon = salones.get(opcion-1);
                        List<Evento> updateListEvento = updateSalon.getEvento();
                        updateListEvento.add(evento);
                        updateSalon.setEvento(updateListEvento);
                        salones.set(opcion-1,updateSalon);

                    }
                    evento.setAprobado(false); //las reservas son desaprobadas por predeterminado
                    eventos.add(evento);//Agrega evento a la lista de eventos
                     
                    break;

                case "3": //Valida la reserva
                    for(int i =0; i<eventos.size();i++) {
                        //Lista los eventos no aprobados
                        if (eventos.get(i).getAprobado()==false) {
                            System.out.println((i++)+". "+eventos.get(i).toString());
                        }
                    }
                    System.out.print("Ingrese el numero de evento que quiere aprobar :"); //Eleccion a validar
                    int indexaporbarevento = Integer.parseInt(scn.nextLine());

                
                    Evento updateEvento = eventos.get(indexaporbarevento-1);
                    Salon findSalon=null;
                    //Encontrar el salon 
                    for(Salon salon : salones){
                        if(salon.getNumero()==updateEvento.getSalon().getNumero()){
                            findSalon=salon;
                        }
                    }
                    //Acceder al salon
                    for (Evento eventoExistente : findSalon.getEvento()) {
                        //Validar si traslapan horarios
                        if (eventoExistente.getAprobado()==true) {
                            if ((updateEvento.getFecha_inicio().before(eventoExistente.getFecha_fin()) &&
                            updateEvento.getFecha_inicio().after(eventoExistente.getFecha_fin())) ||
                            updateEvento.getFecha_inicio().equals(eventoExistente.getFecha_fin()) ||
                            updateEvento.getFecha_inicio().equals(eventoExistente.getFecha_fin())) {
                            System.out.print("No es posible activar ya existe otro evento a esta hora.");
                            }else{
                                for(Evento eventoindex:eventos){
                                    if(eventoindex.getNombre()==updateEvento.getNombre()){
                                        eventoindex.setAprobado(true);
                                    }
                                }
                                
                                
                            }
                        }
                        
                    }
                    break;
                
                case "4"://Enlista eventos aprobados
                    System.out.println("\n ------------------ LISTA DE EVENTOS APROBADOS ------------------\n");
                    int numeroEventosParovados=0;
                    for(Evento eventoi:eventos){
                        if(eventoi.getAprobado()==true){
                            System.out.println(eventoi.toString());
                            numeroEventosParovados++;
                        }
                    }
                    if(numeroEventosParovados==0){ //Validacion de existencia de eventos aprobados
                        System.out.println("No existen aun eventos aprobados");
                    }
                    break;
                case "5": //Salir
                    repeatMenu = false; 
                    System.out.println("Saliendo");
                    break;
        
                default:
                    break;
            }
        }

        

        
       scn.close();

    }
}
// funcion de aprovar peticion (pagar)
// priorizar horarios al aprovar un salon