package model;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

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
    public static String cambio = "";

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

    public void addHijoRecursivo(Persona raiz, String nombre_hijo, String foto, String nombre_padre) {
        Persona hijo = new Persona(nombre_hijo, foto);
        if (raiz.getNombre().equals(nombre_padre)) {

            raiz.addHijo(hijo);
            if (cambio.equals("")) {
                cambio = "1";
            } else {
                cambio = "";
            }
        } else {
            for (int i = 0; i < raiz.getHijos().size(); i++) {
                if (raiz.getNombre().equals(nombre_padre)) {
                    raiz.addHijo(hijo);
                    if (cambio.equals("")) {
                        cambio = "1";
                    } else {
                        cambio = "";
                    }
                } else {
                    addHijoRecursivo(raiz.getHijos().get(i), nombre_hijo, foto, nombre_padre);
                }
            }
        }
    }

    public void verHijosRecursivo(Persona raiz) {
        this.getListaPesona().add(raiz);
        for (Persona hijo : raiz.getHijos()) {
            verHijosRecursivo(hijo);
        }
    }

    public String toString(Persona p) {
        return p.toString(p);
    }

    public String generateFileData(Persona raiz) {
        raiz.setToViewInfo("");
        raiz.setToViewTrans("");
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

    public void generarArchivo(String data) throws IOException {
        String to = System.getProperty("user.dir"); // recupero el directorio del proyecto
        String separator = System.getProperty("file.separator"); //recupero el separador ex: Windows= '\' , Linux='/'
        to = to + separator + "src" + separator + "src" + separator + "data.txt"; // concateno la ruta destino
        String ruta = to;
        File archivo = new File(ruta);
        BufferedWriter bw;
        if (archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(data);
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(data);
        }
        bw.close();
    }

    public Icon GenerateImg() {
        Icon ir = null;

        try {
            String to = System.getProperty("user.dir"); // recupero el directorio del proyecto
            String separator = System.getProperty("file.separator"); //recupero el separador ex: Windows= '\' , Linux='/'
//            String imgname = "";
//            String[] split;
//            split = file.getAbsolutePath().split(separator + separator);
//            imgname = split[split.length - 1];// recupero el nombre de la imagen
            to = to + separator + "src" + separator + "src" + separator; // concateno la ruta destino
//            Path FROM = Paths.get(file.getAbsolutePath());
//            Path TO = Paths.get(to);
//path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz
            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
//path del archivo creado con el codigo del graphviz que queremos
            String fileInputPath = to + separator + "data.txt";

//path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz
//            String fileOutputPath = getClass().getResource("/recurso/arbol.png").toString();
            String fileOutputPath = to + separator + "201410251853.png";

//tipo de imagen de salida, en este caso es jpg
            String tParam = "-Tpng";

            String tOParam = "-o";

//concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas
//recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:
            String[] cmd = new String[5];
            cmd[0] = dotPath;
            cmd[1] = tParam;
            cmd[2] = fileInputPath;
            cmd[3] = tOParam;
            cmd[4] = fileOutputPath;

//Invocamos nuestra clase 
            Runtime rt = Runtime.getRuntime();

//Ahora ejecutamos como lo hacemos en consola
            Process p = rt.exec(cmd);
            p.waitFor();
            File f = new File(fileOutputPath);
            BufferedImage im = ImageIO.read(f);
            ImageIcon ims = new ImageIcon(im);
            ir = (Icon) ims;

//            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
//            return false;
        } finally {
        }
        return ir;

    }
}
