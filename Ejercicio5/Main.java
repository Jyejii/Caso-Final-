package Ejercicio5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su alias:");
        String alias1 = scanner.nextLine();

        System.out.println("Ingrese su correo electrónico:");
        String correo1 = scanner.nextLine();

        UserAccount usuario1 = new UserAccount(alias1, correo1);

        System.out.println("Cuenta creada:");
        System.out.println(usuario1);

        System.out.println("\nIngrese el alias del segundo usuario:");
        String alias2 = scanner.nextLine();

        System.out.println("Ingrese el correo electrónico del segundo usuario:");
        String correo2 = scanner.nextLine();

        UserAccount usuario2 = new UserAccount(alias2, correo2);

        System.out.println("Cuenta creada:");
        System.out.println(usuario2);

        System.out.println("\n¿Desea seguir al segundo usuario? (s/n):");
        String seguir = scanner.nextLine();
        if (seguir.equalsIgnoreCase("s")) {
            Seguir.seguir(usuario1, usuario2);
            System.out.println(alias1 + " ahora está siguiendo a " + alias2);
        }

        System.out.println("\nIngrese el contenido del tweet:");
        String contenidoString = scanner.nextLine();

        Contenido contenido = new Contenido(contenidoString);
        usuario1.tweet(contenido);

        scanner.close();
    }
}


