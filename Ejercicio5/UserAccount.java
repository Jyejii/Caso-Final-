package Ejercicio5;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

public class UserAccount {
    private String alias;
    private String correo;
    private Set<UserAccount> siguiendo;
    private Set<UserAccount> seguidores;
    private List<Tweet> tweets;

    public UserAccount(String alias, String correo) {
        if (!Utils.esCorreoValido(correo)) {
            throw new IllegalArgumentException("Correo electrónico no válido");
        }
        if (!Utils.esAliasValido(alias)) {
            throw new IllegalArgumentException("Alias no válido");
        }

        this.alias = alias;
        this.correo = correo;
        this.siguiendo = new HashSet<>();
        this.seguidores = new HashSet<>();
        this.tweets = new ArrayList<>();
    }

    public void seguir(UserAccount otroUsuario) {
        if (otroUsuario == this) {
            throw new IllegalArgumentException("No puedes seguirte a ti mismo");
        }
        if (siguiendo.contains(otroUsuario)) {
            System.out.println("Ya estás siguiendo a este usuario");
        } else {
            siguiendo.add(otroUsuario);
            otroUsuario.agregarSeguidor(this);
        }
    }

    private void agregarSeguidor(UserAccount seguidor) {
        seguidores.add(seguidor);
    }

    public void tweet(Contenido contenido) {
        Tweet nuevoTweet = new Tweet(contenido.getContenido());
        tweets.add(nuevoTweet);
        for (UserAccount seguidor : seguidores) {
            seguidor.recibirTweet(nuevoTweet);
        }
    }

    private void recibirTweet(Tweet tweet) {
        tweets.add(tweet);
    }

    public List<String> getSeguidores() {
        List<String> listaSeguidores = new ArrayList<>();
        for (UserAccount seguidor : seguidores) {
            listaSeguidores.add(seguidor.alias);
        }
        return listaSeguidores;
    }

    @Override
    public String toString() {
        return "Alias: " + alias + ", Correo electrónico: " + correo;
    }
}


