package co.edu.uniquindio.poo.Model;

public class Efecto8d extends EfectoDecorator{
    public Efecto8d(Reproductor envuelto) { super(envuelto); }
    @Override
    public void reproducir(Contenido c) {
        super.reproducir(c);
        System.out.println("Efecto8D aplicado");
    }
}
