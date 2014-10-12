import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ArmandoPC
 */
public class Persona {

    private String nombre;
    private String foto;
    private ArrayList<Persona> hijos;
    public static String tostring = "";

    public Persona(String nombre) {
        this.hijos = new ArrayList<>();
        this.nombre = nombre;

    }

    /**
     * @return the hijos
     */
    public ArrayList<Persona> getHijos() {
        return hijos;
    }

    /**
     * @param hijos the hijos to set
     */
    public void setHijos(ArrayList<Persona> hijos) {
        this.hijos = hijos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the foto
     */
    public String getFoto() {
        return foto;
    }

    /**
     * @param foto the foto to set
     */
    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void addHijo(Persona hijo) {
//        this.getHijos().add(hijo);

        this.hijos.add(hijo);
//        this.setHijos(this.getHijos());
    }

    public String toString(Persona p) {
        this.tostring = this.tostring + "{\"nombre\":\"" + p.getNombre() + "\"," + "\"hijos\":[";
        for (Persona hijo : p.hijos) {
            this.toString(hijo);
//            p.hijos.
        }
        this.tostring = this.tostring + "]},";
        return this.tostring;
    }

}
