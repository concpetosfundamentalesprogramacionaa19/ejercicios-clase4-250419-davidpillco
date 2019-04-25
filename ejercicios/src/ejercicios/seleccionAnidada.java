/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import paquetedos.OperacionDos;

/**
 *
 * @author Usuario
 */
public class seleccionAnidada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Declaracion de variable 
        
        int calificacion;
        
        // Pidiendo la calificacion 
        
        System.out.println("Ingrese la nota 1 \n");
        calificacion = entrada.nextInt();
        
        // Realizando las evaluaciones a la calificaion
        if (calificacion >= 90){
            System.out.printf("%s %d", OperacionDos.mensaje, calificacion);
            
        }else{
            if (calificacion < 90 && calificacion >= 80){
                System.out.printf("%s %d", OperacionDos.mensajedos, calificacion);
               
            }else{
                if (calificacion < 80 && calificacion >= 50){
                    System.out.printf("%s %d", OperacionDos.mensajetres, calificacion);
                }else{
                    System.out.printf("%s %d", OperacionDos.mensajecuatro, calificacion);
            }
        }
    }
}
}
