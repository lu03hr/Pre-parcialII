package co.edu.uniquindio.poo.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReproductorGlobalTest {

    @Test
    void validarInstancias() {
        ReproductorGlobal r1 = ReproductorGlobal.getInstancia();
        ReproductorGlobal r2 = ReproductorGlobal.getInstancia();

        assertTrue(r1 == r2);
    }
}