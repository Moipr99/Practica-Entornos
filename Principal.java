import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class HolaMundo {
    public static void main(String[] args) {
        System.out.println("Hola, mundo");

        System.out.println("Adios mundo");
    }

    // Método fecha y hora actual
    public static String obtenerFechaHora() {
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return fecha.format(formato);
    }
    
}
