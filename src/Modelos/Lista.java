package Modelos;

import javax.swing.JOptionPane;


public class Lista {
 Nodo primero;
 Nodo auxiliar;
 String cadena = "";
 
 public void Apilar(){
     
     
 }
 public void Apilar(int dato) {
     
     Nodo nuevoNodo = new Nodo(dato);
    
     if(primero == null){
         primero = nuevoNodo;
        
     }
     else {
         nuevoNodo.siguiente = primero;
         primero = nuevoNodo; 
     }
     JOptionPane.showMessageDialog(null, "NODO APILADO");
 }
 
 public String Listar() {
     auxiliar = primero;
     cadena = "";
     while(auxiliar!=null) {
        
         cadena = cadena + "[" + auxiliar.getDato() + "]";
         auxiliar = auxiliar.siguiente;
     }
     return cadena;
    
 }
 
}
