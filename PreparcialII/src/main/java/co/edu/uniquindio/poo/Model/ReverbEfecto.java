package co.edu.uniquindio.poo.Model;

public class ReverbEfecto extends EfectoDecorator{
    public ReverbEfecto(Reproductor envuelto) { super(envuelto); }

    @Override
    public void reproducir(Contenido c) {
        super.reproducir(c);
        System.out.println("Reverb aplicado");
    }
}
