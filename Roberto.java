/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueria;

/**
 *
 * @author Juan David
 */
public class Roberto extends Datos{
     private int servis1;
    private int recau1;

    public Roberto() {
    }

    public Roberto( int cortCab, int cortDam, int tint, int peinado) {
    }
    public int getcortcab() {
        return cortCab;
    }

    public void setcortCabb2(int cortcab2) {
        setservis1(servis1 + cortcab2);
        this.cortCab = cortcab2 * this.cortCab;
        setrecau1(recau1 + this.cortCab);

    }
    public int getcortDam() {
        return cortDam;
    }

    public void setcortDamm2(int cortDam2) {
        setservis1(servis1 + cortDam2);
        this.cortDam = cortDam2 * this.cortDam;
        setrecau1(recau1 + this.cortDam);
    }

    public int gettint() {
        return tint;
    }

    public void settintt2(int tint2) {
        setservis1(servis1 + tint2);
        this.tint = tint2 * this.tint;
        setrecau1(recau1 + this.tint);
    }

    public int getpeinado() {
        return peinado;
    }

    public void setpeinadoo2(int peinado2) {
        setservis1(servis1 + peinado2);
        this.peinado = peinado2 * this.peinado;
        setrecau1(recau1 + this.peinado);
    }

    public int getServis1() {
        return servis1;
    }
    public void setservis1(int servis1) {
        this.servis1 = servis1;
    }

    public int getRecau1() {
        return recau1;
    }
    public void setrecau1(int recau1) {
        this.recau1 = recau1;
    }
    
    
    
}
