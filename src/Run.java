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
        // TODO code application logic here
        Familia a = new Familia();
        Persona raiz = new Persona("Armando");
        raiz.addHijo(new Persona("Yuri"));
        a.addHijoRecursivo(raiz, "Yuri 1", "Armando");
        a.addHijoRecursivo(raiz, "Yuri 1.1", "Yuri");
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
        String json = a.toString(raiz);
        json = json.replaceAll("},]", "}]");
        json = json.substring(0, json.length() - 1);
        String ruta = "archivo1.txt";
        File archivo = new File(ruta);
        BufferedWriter bw;
        if (archivo.exists()) {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(json);
        } else {
            bw = new BufferedWriter(new FileWriter(archivo));
            bw.write(json);
        }
        bw.close();
        JSONObject n = new JSONObject(json);
        JSONArray hijos = n.getJSONArray("hijos");
        for (int i = 0; i < hijos.length(); i++) {
            System.out.println(hijos.getJSONObject(i).getString("nombre"));
            
        }
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
