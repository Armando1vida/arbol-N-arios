import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ArmandoPC
 */
public class Familia {

    /**
     * @return the tostring
     */
    public static String getTostring() {
        return tostring;
    }

    /**
     * @param aTostring the tostring to set
     */
    public static void setTostring(String aTostring) {
        tostring = aTostring;
    }

    private Persona raiz;
    private static String tostring = "";
    private List<Persona> listaPesona = new ArrayList<Persona>();

    /**
     * @return the raiz
     */
    public Persona getRaiz() {
        return raiz;
    }

    /**
     * @param raiz the raiz to set
     * @return
     */
    public Persona setRaiz(Persona raiz) {
        this.raiz = raiz;
        return this.raiz;
    }

    public void addHijoRecursivo(Persona raiz, String nombre_hijo, String nombre_padre) {
        Persona hijo = new Persona(nombre_hijo);
        if (raiz.getNombre().equals(nombre_padre)) {
            raiz.addHijo(hijo);
        } else {
            for (int i = 0; i < raiz.getHijos().size(); i++) {
                if (raiz.getNombre().equals(nombre_padre)) {
                    raiz.addHijo(hijo);
                } else {
                    addHijoRecursivo(raiz.getHijos().get(i), nombre_hijo, nombre_padre);
                }
            }
        }
    }

    public void verHijosRecursivo(Persona raiz) {
        getListaPesona().add(raiz);
//        System.out.println(raiz.getNombre());
        for (Persona hijo : raiz.getHijos()) {
            verHijosRecursivo(hijo);
        }
    }

    public String toString(Persona p) {
        return p.toString(p);
    }

    public String generateFile(Persona raiz) {
        String r = "digraph structs {\n";
        r = r + raiz.verInfo(raiz) + "\n";
        r = r + raiz.verTransicion(raiz) + "\n";
        r = r + "\n}";
        return r;
    }

    /**
     * @return the listaPesona
     */
    public List<Persona> getListaPesona() {
        return listaPesona;
    }

    /**
     * @param listaPesona the listaPesona to set
     */
    public void setListaPesona(List<Persona> listaPesona) {
        this.listaPesona = listaPesona;
    }

}
