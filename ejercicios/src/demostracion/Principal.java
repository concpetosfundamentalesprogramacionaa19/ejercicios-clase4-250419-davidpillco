/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demostracion;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
    // Declaracion de variables
    int mensajes;
    double mensajesad;
    double mensajesad2;
    double total=0;
    double totaliva;
    double totalpagar;
    
    // Pedir el numero de mensajes 
    
    System.out.println ("Ingrese la cantidad de mensajes que ha enviado: ");
    mensajes=entrada.nextInt();
    
    // Evaluacion para calcular el total a pagar 
    
    
    if( mensajes > 0 && mensajes <= 40){
        total = 3;
    }
    if (mensajes > 40 && mensajes <= 200){
        mensajesad = mensajes - 40;
        total = (mensajesad *0.05)+ 3 ;
    }
    if (mensajes > 200){
        mensajesad = (mensajes-40)*0.05;
        mensajesad2 = (mensajes - 200)*0.10;
        total = mensajesad + mensajesad2 + 3;
        
    }
    
    // Calcular el iva
    
    totaliva = total *0.12;
    totalpagar = total + totaliva;
    
    //Presentando el total a pagar 
    
    System.out.printf ("El total a pagar es de: %.2f", totalpagar);
    
    
    }
}
