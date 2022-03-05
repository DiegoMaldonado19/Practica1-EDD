/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ACER
 */
public class Apuesta {
    private String nombreApostador;
    private int monto;
    private int[] posicionesCaballos;

    public Apuesta(String nombreApostador, int monto, int[] posicionesCaballos) {
        this.nombreApostador = nombreApostador;
        this.monto = monto;
        this.posicionesCaballos = posicionesCaballos;
    }

    public String getNombreApostador() {
        return nombreApostador;
    }

    public void setNombreApostador(String nombreApostador) {
        this.nombreApostador = nombreApostador;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int[] getPosicionesCaballos() {
        return posicionesCaballos;
    }

    public void setPosicionesCaballos(int[] posicionesCaballos) {
        this.posicionesCaballos = posicionesCaballos;
    }

    @Override
    public String toString() {
        return "Apuesta{" + "nombreApostador=" + nombreApostador + ", monto=" + monto + ", posicionesCaballos=" + posicionesCaballos + '}';
    }
    
    
    
}
