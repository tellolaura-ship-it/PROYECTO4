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
public class Alumno {
    int legajo;
    String Apellido;
    String nombre;
    HashSet<Materia> materias; 

    public Alumno(int legajo, String Apellido, String nombre) {
        this.legajo = legajo;
        this.Apellido = Apellido;
        this.nombre = nombre;
        materias = new HashSet<>();
              
    }
    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  public void agregarMateria(Materia m){
      materias.add(m);
  }
  public int cantidadMaterias(){
      return materias.size();
  }
}