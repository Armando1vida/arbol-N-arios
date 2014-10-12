/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author ArmandoPC
 */
public class RunTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tree arbol = new Tree();
        arbol.setRootElement(new Node("Armando"));
        arbol.getRootElement().equals(new Node("JU"));
        arbol.getRootElement().equals(new Node("Juan"));
        System.out.println(arbol.toString());
        System.out.println(arbol.toList().toString());

    }

}
