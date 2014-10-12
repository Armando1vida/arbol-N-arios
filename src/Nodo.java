/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ArmandoPC
 */
public class Nodo {

    private String info;
    private int nrhijos;
    private Nodo hijos[];
    private Nodo hijosT[];

    public Nodo(String dato) {
        this.info = dato;
        this.nrhijos = 0;
    }

    /**
     * @return the info
     */
    public String getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info) {
        this.info = info;
    }

    /**
     * @return the nrhijos
     */
    public int getNrhijos() {
        return nrhijos;
    }

    /**
     * @param nrhijos the nrhijos to set
     */
    public void setNrhijos(int nrhijos) {
        this.nrhijos = nrhijos;
    }

    /**
     * @return the hijos
     */
    public Nodo[] getHijos() {
        return hijos;
    }

    /**
     * @param hijos the hijos to set
     */
    public void setHijos(Nodo[] hijos) {
        this.hijos = hijos;
    }

    /**
     * @return the hijosT
     */
    public Nodo[] getHijosT() {
        return hijosT;
    }

    /**
     * @param hijosT the hijosT to set
     */
    public void setHijosT(Nodo[] hijosT) {
        this.hijosT = hijosT;
    }

    public void copiarHijos() {
        this.hijosT = new Nodo[this.getNrhijos() + 1];
        for (int i = 0; i < this.getNrhijos(); i++) {
            this.hijosT[i] = this.hijos[i];
        }
    }

    public void aumentarHijo(Nodo nodo) {
        this.copiarHijos();
        this.hijosT[this.nrhijos] = nodo;
        hijos = hijosT;
        this.nrhijos++;
    }

    public void verNodo() {
        System.out.println("{" + this.info + "}");
    }

}
