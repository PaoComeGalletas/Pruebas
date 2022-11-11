
package pruebas;

import java.util.Iterator;
import java.util.LinkedList;


public class Pruebas {

   
    public static void main(String[] args) {
        
        LinkedList<String> lista=new LinkedList();
        LinkedList<String> lista2=new LinkedList();
        
        lista.add("1");
        
        for(String s: lista){
            if(lista.get(0) != null && lista2.get(0) != null){
                System.out.println("Espacio ocupado");
            }else{
                System.out.println("Falta espacio");
            }
        }
    }
    
}
