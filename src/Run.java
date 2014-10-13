import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ArmandoPC
 */
public class Run {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

//        try {
//
////path del dot.exe,por lo general es la misma, pero depende de donde hayas instalado el paquete de Graphviz
//            String dotPath = "C:\\Program Files (x86)\\Graphviz2.38\\bin\\dot.exe";
////path del archivo creado con el codigo del graphviz que queremos
//            String fileInputPath = "C:\\wamp\\tet.txt ";
//
////path de salida del grafo, es decir el path de la imagen que vamos a crear con graphviz
//            String fileOutputPath = "C:\\wamp\\grafo1.jpg";
//
////tipo de imagen de salida, en este caso es jpg
//            String tParam = "-Tjpg";
//
//            String tOParam = "-o";
//
////concatenamos nuestras direcciones. Lo que hice es crear un vector, para poder editar las direcciones de entrada y salida, usando las variables antes inicializadas
////recordemos el comando en la consola de windows: C:\Archivos de programa\Graphviz 2.21\bin\dot.exe -Tjpg grafo1.txt -o grafo1.jpg Esto es lo que concatenamos en el vector siguiente:
//            String[] cmd = new String[5];
//            cmd[0] = dotPath;
//            cmd[1] = tParam;
//            cmd[2] = fileInputPath;
//            cmd[3] = tOParam;
//            cmd[4] = fileOutputPath;
//
////Invocamos nuestra clase 
//            Runtime rt = Runtime.getRuntime();
//
////Ahora ejecutamos como lo hacemos en consola
//            rt.exec(cmd);
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//        }
        // TODO code application logic here
        Familia a = new Familia();
        Persona raiz = new Persona("Armando");
//        raiz.addHijo(new Persona("Yuri"));
        a.addHijoRecursivo(raiz, "Yuri", "Armando");
        a.addHijoRecursivo(raiz, "Yuri 1", "Armando");
        a.addHijoRecursivo(raiz, "Yuri 1.1", "Yuri 1");
        a.addHijoRecursivo(raiz, "Yuri 1.1.1", "Yuri 1.1");
        a.addHijoRecursivo(raiz, "Yuri 2", "Armando");
        a.addHijoRecursivo(raiz, "Yuri 3", "Armando");
        a.addHijoRecursivo(raiz, "Yuri 4", "Armando");
        a.addHijoRecursivo(raiz, "Yuri 5", "Armando");
        a.addHijoRecursivo(raiz, "Yuri 6", "Armando");
        a.addHijoRecursivo(raiz, "Yuri 7", "Armando");
        a.addHijoRecursivo(raiz, "Yuri 8", "Armando");
        a.addHijoRecursivo(raiz, "Yuri 2.1", "Yuri 2");
        a.addHijoRecursivo(raiz, "Yuri 2.1.1", "Yuri 2.1");
        a.addHijoRecursivo(raiz, "Yuri 2.2", "Yuri 2");
        a.addHijoRecursivo(raiz, "Yuri 2.2.1", "Yuri 2.2");
        a.addHijoRecursivo(raiz, "Yuri 2.2.2", "Yuri 2.2");
        System.out.println(a.generateFileData(raiz));

//        String json = a.toString(raiz);
//        json = json.replaceAll("},]", "}]");
//        json = json.substring(0, json.length() - 1);
//        System.out.println(json);
//        String ruta = "archivo1.txt";
//        File archivo = new File(ruta);
//        BufferedWriter bw;
//        if (archivo.exists()) {
//            bw = new BufferedWriter(new FileWriter(archivo));
//            bw.write(json);
//        } else {
//            bw = new BufferedWriter(new FileWriter(archivo));
//            bw.write(json);
//        }
//        bw.close();
//        JSONObject n = new JSONObject(json);
//        JSONArray hijos = n.getJSONArray("hijos");
//        for (int i = 0; i < hijos.length(); i++) {
//            System.out.println(hijos.getJSONObject(i).getString("nombre"));
//            
//        }
//        System.out.println(n.getString("hijos"));
//        for (JSONObject nh : n.getJSONArray("hijo")) {
//            
//        }
        //        FileReader lector = new FileReader("archivo.txt");
        //        BufferedReader contenido=new BufferedReader(lector);
        //        String texto=contenido.readLine();
        //        System.out.println(texto);
        ////        JSONObject jsonObj = null;
        //        JSONObject jsonObj = new JSONObject(texto);
        //        JSONArray hijos = jsonObj.getJSONArray("hijos");
        //        for (int i = 0; i < hijos.length(); i++) {
        //            String f = hijos.getJSONObject(i).getString("Nombre");
        //            System.out.println(f);
        //        }
        //
        //        System.out.println(jsonObj.getJSONArray("hijos").length());
    }

}
