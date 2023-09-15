/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueria;

/**
 *
 * @author Juan David
 */
public class Lucrecia extends Datos{
     private int servis;
    private int recau;

    public Lucrecia() {
    }

    public Lucrecia( int cortCab, int cortDam, int tint, int peinado) {
    }
    public int getcortcab() {
        return cortCab;
    }

    public void setcortCabb3(int cortcab3) {
        setservis(servis + cortcab3);
        this.cortCab = cortcab3 * this.cortCab;
        setrecau(recau + this.cortCab);

    }
    public int getcortDam() {
        return cortDam;
    }

    public void setcortDamm3(int cortDam3) {
        setservis(servis + cortDam3);
        this.cortDam = cortDam3 * this.cortDam;
        setrecau(recau + this.cortDam);
    }

    public int gettint() {
        return tint;
    }

    public void settintt3(int tint3) {
        setservis(servis + tint3);
        this.tint = tint3 * this.tint;
        setrecau(recau + this.tint);
    }

    public int getpeinado() {
        return peinado;
    }

    public void setpeinadoo3(int peinado3) {
        setservis(servis + peinado3);
        this.peinado = peinado3 * this.peinado;
        setrecau(recau + this.peinado);
    }

    public int getServis() {
        return servis;
    }
    public void setservis(int servis) {
        this.servis = servis;
    }

    public int getRecau() {
        return recau;
    }
    public void setrecau(int recau) {
        this.recau = recau;
    }
    
    
}
