package Ejercicio5;

import java.util.regex.Pattern;

public class Utils {
    public static boolean esCorreoValido(String correo) {
        return correo.contains("@");
    }

    public static boolean esAliasValido(String alias) {
        return Pattern.matches("[a-zA-Z0-9]+", alias);
    }
}

