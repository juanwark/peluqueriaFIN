/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueria;

/**
 *
 * @author Juan David
 */
public class Jose extends Datos {

    private int servis3;
    private int recau3;

    public Jose() {
    }

    public Jose( int cortCab, int cortDam, int tint, int peinado) {
    }

    public int getcortcab() {
        return cortCab;
    }

    public void setcortCabb1(int cortcab1) {
        setservis3(servis3 + cortcab1);
        this.cortCab = cortcab1 * this.cortCab;
        setrecau3(recau3 + this.cortCab);

    }
    public int getcortDam() {
        return cortDam;
    }

    public void setcortDamm1(int cortDam1) {
        setservis3(servis3 + cortDam1);
        this.cortDam = cortDam1 * this.cortDam;
        setrecau3(recau3 + this.cortDam);
    }

    public int gettint() {
        return tint;
    }

    public void settintt1(int tint1) {
        setservis3(servis3 + tint1);
        this.tint = tint1 * this.tint;
        setrecau3(recau3 + this.tint);
    }

    public int getpeinado() {
        return peinado;
    }

    public void setpeinadoo1(int peinado1) {
        setservis3(servis3 + peinado1);
        this.peinado = peinado1 * this.peinado;
        setrecau3(recau3 + this.peinado);
    }

    public int getServis3() {
        return servis3;
    }
    public void setservis3(int servis3) {
        this.servis3 = servis3;
    }

    public int getRecau3() {
        return recau3;
    }
    public void setrecau3(int recau3) {
        this.recau3 = recau3;
    }
}
