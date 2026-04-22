package co.edu.uniquindio.poo.Model;

public class ProxyReproductor implements Reproductor {
    private Reproductor reproductorReal;
    private Usuario usuario;
    private int saltosRealizados = 0;
    private static final int MAX_SALTOS_FREE = 3;
    public ProxyReproductor(Reproductor reproductorReal, Usuario usuario) {
        this.reproductorReal = reproductorReal;
        this.usuario = usuario;
    }
    @Override
    public void reproducir(Contenido c) {
        if (usuario == null) {
            System.out.println("No hay sesión activa");
            return;
        }
        if (usuario.esPremium()) {
            reproductorReal.reproducir(c);
            return;
        }

        System.out.println("[Anuncio] suscribete a premium para evitar anuncios");

        if (c instanceof AudioLibro) {
            System.out.println("Los audio libros son exclusivos para premium");
            return;
        }
        reproductorReal.reproducir(c);
    }
    public boolean puedeSaltar() {
        if (usuario.esPremium()) return true;
        return saltosRealizados < MAX_SALTOS_FREE;
    }
    public void saltar() {
        if (puedeSaltar()) {
            saltosRealizados++;
            System.out.println("Salto realizado (" + saltosRealizados + ")");
        } else {
            System.out.println("Limite de saltos alcanzados, actualizate a premium");
        }
    }
}
