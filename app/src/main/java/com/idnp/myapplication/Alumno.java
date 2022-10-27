package com.idnp.myapplication;

import java.io.Serializable;

public class Alumno implements Serializable {
    String nombre, apellidoP, apellidoM, colegio, carrera, nacimiento;

    public Alumno(String nombre, String apellidoP, String apellidoM, String colegio, String carrera, String nacimiento) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.colegio = colegio;
        this.carrera = carrera;
        this.nacimiento = nacimiento;
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellidoP='" + apellidoP + '\'' +
                ", apellidoM='" + apellidoM + '\'' +
                ", colegio='" + colegio + '\'' +
                ", carrera='" + carrera + '\'' +
                ", nacimiento='" + nacimiento + '\'' +
                '}';
    }
}
