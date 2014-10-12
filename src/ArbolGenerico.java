/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ArmandoPC
 */
public class ArbolGenerico {

    private Nodo raiz;
    public static String cadArbol = "";

    /**
     * @return the raiz
     */
    public Nodo getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     */
    public void setRaiz(Nodo raiz) {
        cadArbol = "'nombre':" + raiz.getInfo() + ",";
        cadArbol = cadArbol + " hijos:[";
        this.raiz = raiz;
    }

    public Nodo insertarRaiz(String dato) {
        this.raiz = new Nodo(dato);
        return this.raiz;
    }

    public void verHijosRecursivo(Nodo nodo) {
        for (int i = 0; i < nodo.getNrhijos(); i++) {
            cadArbol = cadArbol + "{'Info':" + nodo.getHijos()[i].getInfo() + ",";
            cadArbol = cadArbol + "'NRHIJOS':" + nodo.getHijos()[i].getInfo() + ",";
            cadArbol = cadArbol + "'hijos':[";
            if (nodo.getHijos()[i].getNrhijos() > 0) {

            } else {
            }
            nodo.getHijos()[i].verNodo();

            verHijosRecursivo(nodo.getHijos()[i]);
            cadArbol = cadArbol + "]},";

        }
//        cadArbol = cadArbol + "}";
    }

    public void insertarHijo(Nodo nodo, String dato, String padre) {
        Nodo nuevo = new Nodo(dato);
        if (nodo.getInfo().equals(padre)) {
            nodo.aumentarHijo(nuevo);
        } else {
            for (int i = 0; i < nodo.getNrhijos(); i++) {
                if (nodo.getHijos()[i].getInfo().equals(padre)) {
                    nodo.getHijos()[i].aumentarHijo(nuevo);
                } else {
                    insertarHijo(nodo.getHijos()[i], dato, padre);
                }

            }

        }
    }

}
