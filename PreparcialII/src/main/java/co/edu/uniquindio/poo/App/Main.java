package co.edu.uniquindio.poo.App;

import co.edu.uniquindio.poo.Model.*;

public class Main {
    public static void main(String[] args) {

    ReproductorGlobal global = ReproductorGlobal.getInstancia();
    Usuario carolina = new Usuario("U001", "Carolina",
            Usuario.TipoSuscripcion.PREMIUM);
    Usuario juan = new Usuario("U002", "Juan", Usuario.TipoSuscripcion.FREE);
    global.iniciarSesion(carolina);

    ContenidoFactory cancionF = new CancionFactory();
    ContenidoFactory podcastF = new PodcastFactory();
    ContenidoFactory audiolibroF = new AudioLibroFactory();
    Contenido c1 = cancionF.crearContenido("C01", "Feeling Good", 230, "Nina Simon", "I put a spell");
    Contenido c2 = cancionF.crearContenido("C02", "Hotel California", 391, "Eagles",
            "Hotel California");
    Contenido c3 = podcastF.crearContenido("P01", "El Método Lenny", 1800, "Lenny",
            "45");
    Contenido c4 = audiolibroF.crearContenido("A01", "Cien Años de Soledad", 75000,
            "García Márquez", "J. Serrat");

    Playlist favoritas = new Playlist("Favoritas");

    favoritas.agregar(new

    ElementoContenido(c1));
    favoritas.agregar(new

    ElementoContenido(c2));
    Playlist aprender = new Playlist("Aprendizaje");
    aprender.agregar(new

    ElementoContenido(c3));
    aprender.agregar(new

    ElementoContenido(c4));
    Playlist miSemana = new Playlist("Mi semana");
    miSemana.agregar(favoritas);
    miSemana.agregar(aprender);
    miSemana.mostrar("");
    System.out.println("Duración total: "+miSemana.duracionTotal()+" segundos");
    }
}
