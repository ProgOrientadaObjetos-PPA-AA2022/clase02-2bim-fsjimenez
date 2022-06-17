/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete8;

/**
 *
 * @author Usuario iTC
 */
public class EstudiantePresencial extends Estudiante{
    
    private int numeroCreditos;
    private double costoCredito;
    private double matriculaDistancia;
    
    public EstudiantePresencial(String n, String ap, String iden, int e,
            int numAsg, double costoAsg){
        super(iden, e); // ap = apellido // iden = identificacion // e = edad
        establecerNombresEstudiante(n);
        establecerApellidoEstudiante(ap);
        numeroCreditos = numAsg;
        costoCredito = costoAsg;
    }
    
    @Override
    public void establecerNombresEstudiante(String nom){
        nombresEstudiante = nom; // Juan.toUpperCase() >> JUAN 
    }
    
    @Override
    public void establecerApellidoEstudiante(String ape){
        apellidosEstudiante = ape.toLowerCase(); // Juan.toUpperCase() >> JUAN 
    }
    
    // 2.  Método establecerNumeroAsginaturas(numero: Real)
    public void establecerNumeroCreditos(int numero){
        numeroCreditos = numero;
    }
    
    // 3.  Método establecerCostoAsignatura(valor: Real)
    public void establecerCostoCredito(double valor){
        costoCredito = valor;
    }

    // 4.  Método calcularMatriculaDistancia()
    public void calcularMatriculaPresencial(){
        matriculaDistancia = numeroCreditos * costoCredito;
    }

    //  Métodos obtener para los datos o atributos de la clase
    // 5. Método obtenerNumeroAsignaturas() : Entero
    public int obtenerNumeroCreditos(){
        return numeroCreditos; 
    }

    // 6. Método obtenerCostoAsignatura() : Real
    public double obtenerCostoCredito(){
        return costoCredito;
    }

    // 7. Método obtenerMatriculaDistancia() : Real
    public double obtenerMatriculaPresencial(){
        return matriculaDistancia;
    }
    
    @Override
    public String toString(){
        
        String cadenaFinal = String.format("Nombre: %s\n"
                + "Apellido: %s\n"
                + "Identificación: %s\n"
                + "Edad: %s\n"
                + "Costo por Crédito: %.2f\n"
                + "Número de Créditos: %d\n"
                + "Total Matricula: %.2f\n",
                nombresEstudiante,
                apellidosEstudiante,
                identificacionEstudiante,
                edadEstudiante,
                obtenerCostoCredito(),
                obtenerNumeroCreditos(),
                obtenerMatriculaPresencial());
        
        return cadenaFinal;
    }

}
