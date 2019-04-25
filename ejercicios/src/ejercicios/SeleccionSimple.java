package ejercicios;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import paquetedos.*;

/**
 *
 * @author Usuario
 */
public class SeleccionSimple {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //documentacion
        
        int calificacion;
        int calificaciondos;
        
        // Pidiendo los datos
        System.out.println("Ingrese la nota 1 \n");
        calificacion = entrada.nextInt();   
        
        System.out.printf("Ingrese la nota 2 \n");
        calificaciondos = entrada.nextInt();
        
        // Creando el condicional
        
        if (calificacion >= 85){
            System.out.printf("%s %d", Operacion.mensaje, calificacion);
            
        }
        
        if (calificaciondos >= 85){
            System.out.printf("%s %d", Operacion.mensaje, calificaciondos);
        }    
            
    }
    
}
