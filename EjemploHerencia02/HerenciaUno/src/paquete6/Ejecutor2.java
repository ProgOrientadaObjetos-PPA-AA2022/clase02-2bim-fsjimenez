/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete6;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nombre, apellido, identificacion, cadena="";
        double costoCredito;
        int edad, numeroCreditos, condicion;

        do {
            System.out.println("Ingrese el nombre del estudiante: ");
            nombre = entrada.nextLine();

            System.out.println("Ingrese el apellido del estudiante: ");
            apellido = entrada.nextLine();

            System.out.println("Ingrese la identificacion del estudiante: ");
            identificacion = entrada.nextLine();

            System.out.println("Ingrese la edad del estudiante: ");
            edad = entrada.nextInt();

            System.out.println("Ingrese el costo por crédito: ");
            costoCredito = entrada.nextDouble();

            System.out.println("Ingrese el número de créditos: ");
            numeroCreditos = entrada.nextInt();

            System.out.println("Ingrese 1 para seguir ingresando datos");
            condicion = entrada.nextInt();
            
            entrada.nextLine();

            EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                    apellido, identificacion, edad, numeroCreditos, costoCredito);

            estPresencial.calcularMatriculaPresencial();

            cadena = String.format("%s%s\n---------------------------\n",
                    cadena,
                    estPresencial);

        } while (condicion == 1);

        System.out.println(cadena);
    }
}
