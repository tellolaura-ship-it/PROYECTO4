/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package práctico4;

/**
 *
 * @author LAURA TELLO
 */
public class Materia {
    int idMateria;
    String nombre;
    int año;

    public Materia(int idMateria, String nombre, int año) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.año = año;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    @Override
    public String toString() {
        return nombre + " (" + año + ")";
    }

    @Override
    public int hashCode() {
        return idMateria;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Materia)) return false;
        Materia m = (Materia) obj;
        return this.idMateria == m.idMateria;
}
    }
