package co.edu.uniquindio.poo.Model;

public class EfectoDecorator implements Reproductor{
    protected Reproductor envuelto;
    public EfectoDecorator(Reproductor envuelto) {
        this.envuelto = envuelto;
    }
    @Override
    public void reproducir(Contenido c) {
        envuelto.reproducir(c);
    }

    public static Reproductor construirReproductor(Usuario u, boolean eq, boolean reverb, boolean d8) {
        Reproductor r = new ReproductorBase();
        if(eq) {
            r = new EQEfecto(r);
        }
        if(reverb) {
            r = new ReverbEfecto(r);
        }
        if(d8) {
            r = new Efecto8d(r);
        }
        return new ProxyReproductor(r, u);
    }
}
