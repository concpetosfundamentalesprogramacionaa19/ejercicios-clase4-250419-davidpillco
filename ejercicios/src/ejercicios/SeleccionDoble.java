/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import paquetedos.Operacion;

/**
 *
 * @author Usuario
 */
public class SeleccionDoble {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //documentacion
        
        int calificacion;
        int calificaciondos;
        
        // Pidiendo las notas
        
        System.out.println("Ingrese la nota 1 \n");
        calificacion = entrada.nextInt();   
        
        System.out.printf("Ingrese la nota 2 \n");
        calificaciondos = entrada.nextInt();
        
        // Creando el condicional
        
        if (calificacion >= 85){
            System.out.printf("%s %d", Operacion.mensaje, calificacion);
            
        }else{
            System.out.printf("%s %d",Operacion.mensajedos, calificacion);
        
        if (calificaciondos >= 85){
            System.out.printf("%s %d", Operacion.mensaje, calificaciondos);
        }else{
            System.out.printf("%s %d", Operacion.mensajedos, calificaciondos);    
        }    
    }

    }
    
}
