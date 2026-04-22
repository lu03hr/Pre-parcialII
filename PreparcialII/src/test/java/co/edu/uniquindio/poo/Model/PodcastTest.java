package co.edu.uniquindio.poo.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PodcastTest {

    @Test
    void validarDatos() {

        assertThrows(IllegalArgumentException.class, () -> new Podcast("", "Hola", 0, "Yo", 20));
    }
}