import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;

public class Main{
   
    public static void main(String[] args) {
        List<Salon> salones = new ArrayList<>();
        List<Evento> eventos = new ArrayList<>();
        System.err.println("Bienvenido");
        
        System.out.println(salones.size());
        
        for (int i = 0; i<4; i++){
            System.out.println("\n--------NUEVO SALON-------\n");
            salones = addSalon(salones);
        }
        System.out.println(salones.size());
        System.out.println(salones.toString());


        System.out.println("MENU");
        System.out.print("1. Ingresar un nuevo salon : ");

        System.out.print("2. Realizar una reservación :");

        System.out.print("3. Aprovar una reservacion :");
        
        System.out.println("4. Salir");

        addReserva(eventos, salones);
       

    }

    //Funciones Salon
    
    public static List<Salon> addSalon(List<Salon> list){
        Scanner sc = new Scanner(System.in);
        Salon newsalon = new Salon(); 

        System.out.print("Ingrese el numero del salon : ");
        int po = Integer.parseInt(sc.nextLine());

        boolean find = true;

        while (find) {
            find=false;
            for (Salon salon : list) {
                if (salon.getNumero() == po) find = true;
            }
            if (!find) {
                newsalon.setNumero(po);
            } else {
                System.out.println("Este número de salón ya existe, elija otro:");
                po = Integer.parseInt(sc.nextLine());
            }
        }
        
        int r = 0;
        int op;
        while(r == 0){
            System.out.println("Seleccione el tamaño del salon");
            System.out.println("         1. Grande");
            System.out.println("         2. Mediano");
            System.out.println("         3. Pequeño");

            op = Integer.parseInt(sc.nextLine());

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
                newsalon.setCapacidad(Integer.parseInt(sc.nextLine()));
        
                System.out.println("Ingrese el costo del salon");
                newsalon.setCosto(Integer.parseInt(sc.nextLine()));
        
                list.add(newsalon);
                return list;
            }
        }
        // System.out.println("Seleccione el tamaño del salon");
        //     System.out.println("         1. Grande");
        //     System.out.println("         2. Mediano");
        //     System.out.println("         3. Pequeño");

        // int op = sci.nextInt();

        // if(op > 3  || op < 1){
        //     System.out.println("Opcion invalida");
        // }
        // else{
        //     switch (op) {
        //         case 1:
        //             newsalon.setTamano("Grande");
        //             break;
        //         case 2:
        //             newsalon.setTamano("Mediano");
        //             break;
    
        //         case 3:
        //             newsalon.setTamano("Pequeño");
        //             break;
    
        //         default:
        //             break;
        //     }
        //     System.out.println("Ingrese la capacidad del salon");
        //     newsalon.setCapacidad(Integer.parseInt(sc.nextLine()));
    
        //     System.out.println("Ingrese el costo del salon");
        //     newsalon.setCosto(Integer.parseInt(sc.nextLine()));
    
        //     list.add(newsalon);
        //     return list;
        // }
            return list;
        
    }

    //Funciones Evento
    
    public static List<Evento> addReserva(List<Evento> list, List<Salon> salones){
        //Creacion de scanner, eventos y evento
        List<String> eventosPosibles = List.of("Conferencia internacional", "Boda", "Gala", "XV años", "Convivio", "Reunión de trabajo", "Bautizo");
        List<String> eventosVIP = eventosPosibles.subList(0, 3);
        Scanner sc = new Scanner(System.in);
        Evento evento = new Evento();

        
        //listar las opciones de List externo
        

        Boolean typeExists = false;

        while(!typeExists){
            for (int i=0; i<eventosPosibles.size(); i++){
                System.out.print(i+1 + "    " + eventosPosibles.get(i) + "\n");
            }

            System.out.print("\nSelecccione un tipo de Evento: ");
            int Ntipo = Integer.parseInt(sc.nextLine());

            if (Ntipo < eventosPosibles.size()+1){
                evento.setTipo(eventosPosibles.get(Ntipo-1)); //Agrega el tipo a su atributo
                typeExists = true;
            }
            else{
                System.out.println("\n\n>>>>>No existe esa opcion\n");
            }
        }
        
        System.out.print("\nIngrese el nombre del evento: ");
        evento.setNombre(sc.nextLine());

        System.out.print("\nIngrese el nombre del encargado: ");
        evento.setEncargado(sc.nextLine()); //agrega al atributo encargado

       
        Boolean valido = true;
        while (valido){
            System.out.print("\nIngrese la fecha de inicio del evento (dd-MM-yyyy HH:mm): ");
            String fecha = sc.nextLine(); 
    
            SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy HH:mm"); 
            formato.setLenient(false);

            try {
                Date fecha_inicio = formato.parse(fecha);
                evento.setFecha_inicio(fecha_inicio);
                valido = false;

            } catch (ParseException e){
                System.out.print("\n>>>>Formato de fecha invalido");
            }
        }

        System.out.print("\nIngrese la duracion en horas del evento: ");

        Calendar horas = Calendar.getInstance();
        horas.setTime(evento.getFecha_inicio());

        horas.add(Calendar.HOUR_OF_DAY, Integer.parseInt(sc.nextLine()));

        Date fechaFin = horas.getTime();
        evento.setFecha_fin(fechaFin);

        Boolean SalonExists = false;
        while(!SalonExists){
            for ( int i = 0; i<salones.size(); i++) {
                System.out.print(i+1 + "    " + salones.get(i).toString() + "\n");
                SalonExists = true;
            }

            System.out.print("\nIngrese el numero de salon que quiere reservar: ");
            int opcion = Integer.parseInt(sc.nextLine());

            if (salones.get(opcion-1).getTamano() != "Grande"){
                evento.setSalon(salones.get(opcion-1));
            }
            else{

                Boolean repeat = false;
                for(int i=0; i<eventosVIP.size(); i++){

                    if(evento.getTipo().equals(eventosVIP.get(i))){
                        evento.setSalon(salones.get(opcion-1));
                        SalonExists = true;
                    }
                    else{
                        repeat = true;
                    }
                }
                if(repeat){
                    System.out.println(">>> El evento no cumple con los requisitos");
                }
            }

        }
        evento.setAprobado(false);
        sc.close();
        System.out.println(evento.toString());
        return list;
    }
}
