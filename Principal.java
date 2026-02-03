import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.println("Hola, mundo");

        System.out.println("Adios mundo");

       // Llamada al método fecha y hora
        System.out.println("Fecha y hora actual: " + obtenerFechaHora());

        // USUARIO
        System.out.print("\nIntroduce el número de usuarios: ");
        int numero = Integer.parseInt(key.nextLine().trim());

        Usuario[] usuarios = crearUsuarios(numero, key);
        

        System.out.println("\nListado de usuarios:");
        for (Usuario u : usuarios) {
            System.out.println(
                "Nombre: " + u.nombre +
                ", Apellidos: " + u.apellidos +
                ", Email: " + u.email
            );
        }
    }

    // Método fecha y hora actual
    public static String obtenerFechaHora() {
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return fecha.format(formato);
    }

    // Método que crea y devuelve un array de Usuario
    public static Usuario[] crearUsuarios(int numero, Scanner key) {
        Usuario[] usuarios = new Usuario[numero];

        for (int i = 0; i < numero; i++) {
            System.out.println("\nUsuario " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = key.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = key.nextLine();

            System.out.print("Email: ");
            String email = key.nextLine();

            usuarios[i] = new Usuario(nombre, apellidos, email);
        }
        return usuarios;
    }

}
