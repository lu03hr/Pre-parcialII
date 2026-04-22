package co.edu.uniquindio.poo.Model;

public class EQEfecto extends EfectoDecorator {
    public EQEfecto(Reproductor envuelto) { super(envuelto); }
    @Override
    public void reproducir(Contenido c) {
        super.reproducir(c);
        System.out.println( "Ecualizador aplicado");
    }
}
