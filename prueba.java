import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class prueba{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Evento evento = new Evento();

        System.out.println("Ingrese la fecha de inicio del evento");
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
        evento.setFecha_inicio(SimpleDateFormat(formato.parse(sc.next())));

        sc.close();
    }   

}
