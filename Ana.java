/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.peluqueria;

/**
 *
 * @author Juan David
 */
public class Ana extends Datos {

    private int servis2;
    private int recau2;

    public Ana() {
    }

    public Ana( int cortCab, int cortDam, int tint, int peinado) {
    }

    public int getcortCab() {
        return cortCab;
    }

    public void setcortCabb(int cortcab) {
        setservis2(servis2 + cortcab);
        this.cortCab = cortcab * this.cortCab;
        setrecau2(recau2 + this.cortCab);

    }

    public int getcortDam() {
        return cortDam;
    }

    public void setcortDamm(int cortDam) {
        setservis2(servis2 + cortDam);
        this.cortDam = cortDam * this.cortDam;
        setrecau2(recau2 + this.cortDam);
    }

    public int gettint() {
        return tint;
    }

    public void settintt(int tint) {
        setservis2(servis2 + tint);
        this.tint = tint * this.tint;
        setrecau2(recau2 + this.tint);
    }

    public int getpeinado() {
        return peinado;
    }

    public void setpeinadoo(int peinado) {
        setservis2(servis2 + peinado);
        this.peinado = peinado * this.peinado;
        setrecau2(recau2 + this.peinado);
    }

    public int getServis2() {
        return servis2;
    }
    public void setservis2(int servis2) {
        this.servis2 = servis2;
    }

    public int getRecau2() {
        return recau2;
    }
    public void setrecau2(int recau2) {
        this.recau2 = recau2;
    }
}
