/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package librocalificaciones;

import java.util.Scanner;

/**
 *
 * @author xaxbe
 */


public class LibroCalificaciones {
    private String nombreDelCurso;
    private int[] calificaciones;
    
    public LibroCalificaciones(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
        calificaciones = new int[10];
    }
    
    public void establecerNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }
    
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }
    
    public void mostrarMensaje() {
        System.out.println("Bienvenido al curso: " + nombreDelCurso);
    }
    
    public void determinarPromedioClase() {
        Scanner entrada = new Scanner(System.in);
        int total = 0;
        
        for (int contadorCalif = 0; contadorCalif < calificaciones.length; contadorCalif++) {
            System.out.print("Ingrese una calificación: ");
            int calificacion = entrada.nextInt();
            calificaciones[contadorCalif] = calificacion;
            total += calificacion;
        }
        
        int promedio = total / calificaciones.length;
        System.out.println("El promedio total de la clase es: " + promedio);
    }
}

class PruebaLibroCalificaciones {
    public static void main(String[] args) {
        LibroCalificaciones miLibroCalificaciones = new LibroCalificaciones("Clases Don Chuy");
        
        miLibroCalificaciones.mostrarMensaje();
        miLibroCalificaciones.determinarPromedioClase(); 
    }
}
