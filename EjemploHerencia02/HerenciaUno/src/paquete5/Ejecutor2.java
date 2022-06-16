/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre, apellido, identificacion;
        int edad, numeroCre;
        double precioCre;
        
        System.out.println("Ingrese el nombre del estudiante: ");
        nombre = entrada.nextLine();
        
        System.out.println("Ingrese el apellido del estudiante: ");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese la identificacion del estudiante: ");
        identificacion = entrada.nextLine();
        
        System.out.println("Ingrese la edad del estudiante: ");
        edad = entrada.nextInt();
        
        System.out.println("Ingrese el costo por crédito: ");
        precioCre = entrada.nextDouble();
        
        System.out.println("Ingrese el número de créditos: ");
        numeroCre = entrada.nextInt();
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numeroCre, precioCre);
        
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
