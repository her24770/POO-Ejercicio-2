import java.util.Scanner;

public class Main{
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.err.println("Bienvenido");
        
    }

    //Funciones Salon
    public void addSalon(){
        System.out.println("Ingrese el numero del salon");
        //vlidar que no exista el salon antes
        System.out.println("Seleccione el tamaño del salon");
            System.out.println("         1. Grande");
            System.out.println("         2. Mediano");
            System.out.println("         2. Pequeño");
        if(sc.nextLine()!="1" || sc.nextLine()!="2" || sc.nextLine()!="3"){
            System.out.println("Opcion invalida");
        }
        System.out.println("Ingrese la capacidad del salon");
        System.out.println("Ingrese el costo del salon");
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
