package co.edu.uniquindio.poo.Model;

public class ReproductorBase implements Reproductor {
    @Override
    public void reproducir(Contenido c) {
        System.out.println("Reproduciendo: " + c.getTitulo());
        c.reproducir();
    }
}
