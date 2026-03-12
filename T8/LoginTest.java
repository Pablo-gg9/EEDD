/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import modelos.CerraduraElectronica;
import modelos.CerraduraElectronica.estado;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author Usuario
 */
public class LoginTest {

    

    @Test
    void contadorComienzaEnCero() {
        CerraduraElectronica cerradura = new CerraduraElectronica();
        assertEquals(0, cerradura.getFallos());
    }

    @Test
    void sistemaNoBloqueadoInicio() {
        CerraduraElectronica cerradura = new CerraduraElectronica();
        assertNotEquals(estado.BLOQUEADO, cerradura.getEstadoActual());
    }

    @Test
    void intentoFallidoIncrementaContador() {
        CerraduraElectronica cerradura = new CerraduraElectronica();
        cerradura.introducirPin(9999);
        assertEquals(1, cerradura.getFallos());
    }

    @Test
    void variosIntentosFallidosIncrementanContador() {
        CerraduraElectronica cerradura = new CerraduraElectronica();
        cerradura.introducirPin(9999);
        cerradura.introducirPin(8888);
        assertEquals(2, cerradura.getFallos());
    }

    @Test
    void intentoCorrectoReiniciaContador() {
        CerraduraElectronica cerradura = new CerraduraElectronica();
        cerradura.introducirPin(9999);
        cerradura.introducirPin(1234);
        assertEquals(0, cerradura.getFallos());
    }

    @Test
    void tresIntentosFallidosBloqueaSistema() {
        CerraduraElectronica cerradura = new CerraduraElectronica();
        cerradura.introducirPin(9999);
        cerradura.introducirPin(8888);
        cerradura.introducirPin(7777);
        assertEquals(estado.BLOQUEADO, cerradura.getEstadoActual());
    }

    @Test
    void intentoCorrectoDespuesBloqueoReiniciaSistema() {
        CerraduraElectronica cerradura = new CerraduraElectronica();
        cerradura.introducirPin(9999);
        cerradura.introducirPin(8888);
        cerradura.introducirPin(7777);
        cerradura.introducirPinAdmin(0000);
        assertEquals(estado.DESBLOQUEADO, cerradura.getEstadoActual());
    }

    @Test
    void reiniciarContadorConCeroFallosNoDaEror() {
        CerraduraElectronica cerradura = new CerraduraElectronica();
        cerradura.introducirPinAdmin(0000);
        assertEquals(0, cerradura.getFallos());
        assertEquals(estado.DESBLOQUEADO, cerradura.getEstadoActual());
    }

    @Test
    void variasOperacionesEstadoCoherente() {
        CerraduraElectronica cerradura = new CerraduraElectronica();
        cerradura.introducirPin(9999);
        cerradura.introducirPin(1234);
        cerradura.introducirPin(9999);
        cerradura.introducirPin(1234);
        assertEquals(estado.DESBLOQUEADO, cerradura.getEstadoActual());
        assertEquals(0, cerradura.getFallos());

    }

    @Test
    void intentoFallidoSistemaBloqueado() {
        CerraduraElectronica cerradura = new CerraduraElectronica();
        cerradura.introducirPin(9999);
        cerradura.introducirPin(9999);
        cerradura.introducirPin(9999);

        assertThrows(IllegalStateException.class, () -> cerradura.introducirPin(9999));
          
          
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
