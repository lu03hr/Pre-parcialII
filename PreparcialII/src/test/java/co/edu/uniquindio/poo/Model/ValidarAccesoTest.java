package co.edu.uniquindio.poo.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidarAccesoTest {
    @Test
    void validarAcceso() {
        Contenido c = new AudioLibro("12345", "El principito", 1200000, "George", "Georgia" );
        Usuario u = new Usuario("12345", "Nicolas", Usuario.TipoSuscripcion.PREMIUM);
        assertTrue(ValidarAcceso.puedeReproducir(u, c));
    }

}