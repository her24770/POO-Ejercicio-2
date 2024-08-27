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
        Scanner sci = new Scanner(System.in);
        Salon newsalon = new Salon(); 

        System.out.println("Ingrese el numero del salon");
        //vlidar que no exista el salon antes
        newsalon.setNumero(Integer.parseInt(sc.nextLine()));
        System.out.println("Seleccione el tamaño del salon");
            System.out.println("         1. Grande");
            System.out.println("         2. Mediano");
            System.out.println("         3. Pequeño");

        // String op =sc.nextLine();
        // if(op!="1" || op!="2" || op!="3"){
        //     System.out.println("Opcion invalida");
        // }
        // switch (op) {
        //     case "1":
        //         newsalon.setTamano("Grande");
        //         break;
        //     case "2":
        //         newsalon.setTamano("Mediano");
        //         break;

        //     case "3":
        //         newsalon.setTamano("Pequeño");
        //         break;

        //     default:
        //         break;
        // }

        int op = sci.nextInt();
        if(op > 3  || op < 1){
            System.out.println("Opcion invalida");

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
            System.out.println("Ingrese la capacidad del salon");
            newsalon.setCapacidad(Integer.parseInt(sc.nextLine()));
    
            System.out.println("Ingrese el costo del salon");
            newsalon.setCosto(Integer.parseInt(sc.nextLine()));
    
            list.add(newsalon);
            return list;
        }
            return list;
        
    }

    //Funciones Evento
    public void addReserva(){
        
        System.out.println("Selecccione un tipo de Evento");
        //listar las opcinoes de List externo
        System.out.println("Ingrese el nombre del encargado");
        System.out.println("Ingrese la fecha de inicio del evento");
        System.out.println("Ingrese la duracion en horas del evento");
        System.out.println("Ingrese el numero de salon que quiere reservar");
        //listar los salones
        //asignar valor aprobado false
    
    }
}
