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
    
    /**
     * Variables que son necesarias para instanciar y son de importancia para el contexto del programa
     */
    private String nombreApostador;
    private int monto;
    private int[] posicionesCaballos;
    private boolean isCorrecta;
    private int puntaje;

    /**
     * Constructor de la clase
     * @param nombreApostador   nombre del apostador
     * @param monto monto de la apuesta
     * @param posicionesCaballos    arreglo que contiene las posiciones que el apostador eligio
     */
    public Apuesta(String nombreApostador, int monto, int[] posicionesCaballos) {
        this.nombreApostador = nombreApostador;
        this.monto = monto;
        this.posicionesCaballos = posicionesCaballos;
        this.isCorrecta=true;
        this.puntaje=0;
    }

    /**
     * Getters y setters de la clase
     * @return 
     */
    
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

    public boolean isIsCorrecta() {
        return isCorrecta;
    }

    public void setIsCorrecta(boolean isCorrecta) {
        this.isCorrecta = isCorrecta;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Apuesta{" + "nombreApostador=" + nombreApostador + ", monto=" + monto + ", posicionesCaballos=" + posicionesCaballos + ", isCorrecta=" + isCorrecta + ", puntaje=" + puntaje + '}';
    }
}
