/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author ArmandoPC
 */
public class RunTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        Tree arbol = new Tree();
//        arbol.setRootElement(new Node("Armando"));
//        arbol.getRootElement().equals(new Node("JU"));
//        arbol.getRootElement().equals(new Node("Juan"));
//        System.out.println(arbol.toString());
//        System.out.println(arbol.toList().toString());
//        String s = System.getProperty("user.dir");
//        String ss = System.getProperty("file.separator");
//        System.out.println(s);
//        System.out.println(ss);
        Path FROM = Paths.get("C:\\Users\\ArmandoPC\\Documents\\NetBeansProjects\\arbol.png");
        Path TO = Paths.get("F:\\arbol.png");
        //sobreescribir el fichero de destino, si existe, y copiar
        // los atributos, incluyendo los permisos rwx
        CopyOption[] options = new CopyOption[]{
            StandardCopyOption.REPLACE_EXISTING,
            StandardCopyOption.COPY_ATTRIBUTES
        };
        Files.copy(FROM, TO, options);

    }

}
