import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main{
   
    public static void main(String[] args) {
        List<Salon> salones = new ArrayList<>();
        System.err.println("Bienvenido");
        
        System.out.println(salones.size());
        
        for (int i = 0; i<4; i++){
            System.out.println("\n--------NUEVO SALON-------\n");
            salones = addSalon(salones);
        }
        System.out.println(salones.size());
        System.out.println(salones.toString());


        System.out.println("MENU");
        System.out.println("1. Ingresar un nuevo salon");

        System.out.println("2. Realizar una reservación");

        System.out.println("3. Aprovar una reservacion");
        
        System.out.println("4. Salir");
        
        

    }

    //Funciones Salon
    
    public static List<Salon> addSalon(List<Salon> list){
        Scanner sc = new Scanner(System.in);
        Salon newsalon = new Salon(); 

        System.out.print("Ingrese el numero del salon : ");
        //vlidar que no exista el salon antes

        int po = Integer.parseInt(sc.nextLine());
        Boolean z = true;
        while(z == true){
            if (list.isEmpty()) {
                newsalon.setNumero(po);
                z = false;
            }
            for(Salon salon : list){
                    if(salon.getNumero() == po){
                        System.out.println("Este numero de salon ya esta en uso, eliga otro");
                        po = Integer.parseInt(sc.nextLine());
                    }
                    else{
                        newsalon.setNumero(Integer.parseInt(sc.nextLine()));
                        z = false;
                    }
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
    List<String> eventosPosibles = List.of("Conferencia internacional", "Boda", "Gala", "Convivio", "Reunión de trabajo", "Bautizo");

    public void addReserva(){
        //Creacion de scanner y evento
        Scanner sc = new Scanner(System.in);
        Evento evento = new Evento();

        //listar las opcinoes de List externo
        for (int i=0; i<eventosPosibles.size(); i++){
            System.out.print(i + "    " + eventosPosibles.get( i-1) + "\n");
        }
        
        System.out.print("\nSelecccione un tipo de Evento: ");
        evento.setTipo(eventosPosibles.get(Integer.parseInt(sc.nextLine())-1)); //Agrega el tipo a su atributo
        
        System.out.println("Ingrese el nombre del encargado");
        evento.setEncargado(sc.nextLine()); //agrega al atributo encargado

        System.out.println("Ingrese la fecha de inicio del evento");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        // evento.setFecha_inicio(SimpleDateFormat(formato.parse(sc.nextLine()));

        System.out.println("Ingrese la duracion en horas del evento");

        System.out.println("Ingrese el numero de salon que quiere reservar");
        
        //listar los salones
        //asignar valor aprobado false
    
    }
}
