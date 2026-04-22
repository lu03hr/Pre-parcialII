package co.edu.uniquindio.poo.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EfectoDecoratorTest {

    @Test
    void construirReproductor() {
        Usuario u = new Usuario("12345", "Nicolas", Usuario.TipoSuscripcion.PREMIUM);

        Reproductor r = EfectoDecorator.construirReproductor(u, false, true, true);
        assertTrue(r instanceof ProxyReproductor);
    }
}