/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctico4;

import java.util.HashSet;

/**
 *
 * @author LAURA TELLO
 */
public class Colegio {

public static void main(String[] args) {
        // TODO code application logic here
        Materia web2 = new Materia (1,"Web 2", 2);
        Materia Matemáticas = new Materia (2, "Matemáticas", 1);
        Materia Laboratorio1 = new Materia (3, "Laboratorio1", 1);
        HashSet<Materia> materias = new HashSet <> ();
        materias.add(web2);
        materias.add(Matemáticas);
        materias.add(Laboratorio1);
        
    Alumno alumno1 = new Alumno (1001, "López", "Martin");
    Alumno alumno2 = new Alumno (1002, "Martínez", "Brenda"); 
    
    alumno1.agregarMateria(web2);
    alumno1.agregarMateria(Matemáticas);
    alumno1.agregarMateria(Laboratorio1);
    
    alumno2.agregarMateria(web2);
    alumno2.agregarMateria(Matemáticas);
    alumno2.agregarMateria(Laboratorio1);
    alumno2.agregarMateria(Laboratorio1);
    
        System.out.println("Cantidad de materias de López: " + alumno1.cantidadMaterias());
        System.out.println("Cantidad de materias de Martínez: " + alumno2.cantidadMaterias());
}
    }
