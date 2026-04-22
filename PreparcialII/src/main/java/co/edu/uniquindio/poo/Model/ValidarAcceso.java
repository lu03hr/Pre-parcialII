package co.edu.uniquindio.poo.Model;

public class ValidarAcceso {
    public static boolean puedeReproducir(Usuario u, Contenido c) {
        if (u == null) return false;
        if (u.esPremium()) return true;

        if (c instanceof AudioLibro) return false;
        return true;
    }
}
