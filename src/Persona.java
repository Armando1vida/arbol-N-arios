import java.util.ArrayList;
import java.util.Random;

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
    private String ID;
    private String foto;
    private ArrayList<Persona> hijos;
    private static String tostring = "";
    private static String toViewInfo = "";
    private static String toViewTrans = "";

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

    /**
     * @return the toViewInfo
     */
    public static String getToViewInfo() {
        return toViewInfo;
    }

    /**
     * @param aToViewInfo the toViewInfo to set
     */
    public static void setToViewInfo(String aToViewInfo) {
        toViewInfo = aToViewInfo;
    }

    /**
     * @return the toViewTrans
     */
    public static String getToViewTrans() {
        return toViewTrans;
    }

    /**
     * @param aToViewTrans the toViewTrans to set
     */
    public static void setToViewTrans(String aToViewTrans) {
        toViewTrans = aToViewTrans;
    }

    public Persona(String nombre) {
        this.hijos = new ArrayList<>();
        this.nombre = nombre;
        Random r = new Random();
        int valorDado = r.nextInt(100000) + 1;
        this.ID = valorDado + "";
//        this.ID = java.util.UUID.randomUUID().toString();
//        this.ID=this.ID.replaceAll("-", "");

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

        this.getHijos().add(hijo);
//        this.setHijos(this.getHijos());
    }

    public String toString(Persona p) {
        this.setTostring(this.getTostring() + "{\"nombre\":\"" + p.getNombre() + "\"," + "\"hijos\":[");
        for (Persona hijo : p.getHijos()) {
            this.toString(hijo);
//            p.hijos.
        }
        this.setTostring(this.getTostring() + "]},");
        return this.getTostring();
    }
//h1 [margin=0 shape=box, style=filled, fillcolor=white, color=blue, label=<<TABLE border="0" cellborder="0">
//                       <TR><TD width="60" height="50" fixedsize="true"><IMG SRC="C:\Capturas.PNG" scale="true"/></TD><td><font point-size="10">protein2ppw</font></td></TR>
//              </TABLE>>];

    public String verInfo(Persona p) {
        this.setToViewInfo(this.getToViewInfo() + "\n" + p.getID() + " [margin=0 shape=box, style=filled, fillcolor=white, color=blue, label=<<TABLE border=\"0\" cellborder=\"0\"><TR><TD width=\"60\" height=\"50\" fixedsize=\"true\"><IMG SRC=\"C:\\Capturas.PNG\" scale=\"true\"/></TD><td><font point-size=\"10\">" + p.getNombre() + "</font></td></TR></TABLE>>];");
        for (Persona hijo : p.getHijos()) {
            this.verInfo(hijo);
        }
        return this.getToViewInfo();

    }

    public String verTransicion(Persona p) {
        this.setToViewTrans(this.getToViewTrans() + "\n");
        for (Persona hijo : p.getHijos()) {
            this.setToViewTrans(this.getToViewTrans() + p.getID() + " -> " + hijo.getID() + " ;");
            this.verTransicion(hijo);
        }
        return this.getToViewTrans();
    }

    /**
     * @return the ID
     */
    public String getID() {
        return "struct"+ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return this.getNombre(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
