/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        String nombre = "Felipe";
        String apellido = "Jimenez";
        String identificacion = "110011";
        int edad = 18;
        
        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);
        
        estPresencial.establecerCostoCredito(50.5);
        estPresencial.establecerNumeroCreditos(5);
        estPresencial.calcularMatriculaPresencial();
        
        System.out.println(estPresencial);
    }
}
