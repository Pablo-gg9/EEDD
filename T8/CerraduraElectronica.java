/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Usuario
 */
public class CerraduraElectronica {
    private static final int PIN_CORRECTO = 1234;
    private static final int PIN_ADMIN = 0000;
    private static final int MAX_FALLOS = 3;

    public Object getEstado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   

    public enum estado {
        DESBLOQUEADO,
        BLOQUEADO,
        ESPERANDO
    }

    private int fallos;
    private estado estadoActual;
    public CerraduraElectronica() {
        this.fallos = 0;
        this.estadoActual = estado.ESPERANDO;
    }

    public int getFallos() {
        return fallos;
    }

    public void setFallos(int fallos) {
        this.fallos = fallos;
    }

    public estado getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(estado estadoActual) {
        this.estadoActual = estadoActual;
    }
   public void introducirPin(int pin) {
        if (estadoActual == estado.BLOQUEADO) {
            throw new IllegalStateException("ESTADO BLOQUEADO :INTRODUCIR PIN ADMIN");
        }

        if (pin == PIN_CORRECTO) {
            fallos = 0;
        } else {
            fallos++;
            if (fallos >= MAX_FALLOS) {
                estadoActual = estado.BLOQUEADO;
            }
        }
    }
   
    public void introducirPinAdmin(int pin) {
        if (pin == PIN_ADMIN) {
            fallos = 0;
            estadoActual = estado.DESBLOQUEADO;
        }
    }


}
