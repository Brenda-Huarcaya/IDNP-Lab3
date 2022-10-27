package com.idnp.myapplication;
import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Alumno implements Parcelable {
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

    protected Alumno(Parcel in) {
        nombre = in.readString();
        apellidoP = in.readString();
        apellidoM = in.readString();
        colegio = in.readString();
        carrera = in.readString();
        nacimiento = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(apellidoP);
        dest.writeString(apellidoM);
        dest.writeString(colegio);
        dest.writeString(carrera);
        dest.writeString(nacimiento);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Alumno> CREATOR = new Creator<Alumno>() {
        @Override
        public Alumno createFromParcel(Parcel in) {
            return new Alumno(in);
        }

        @Override
        public Alumno[] newArray(int size) {
            return new Alumno[size];
        }
    };

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
                nombre + '\n' +
                apellidoP + '\n' +
                apellidoM + '\n' +
                colegio + '\n' +
                carrera + '\n' +
                nacimiento +
                "}";
    }
}
