package com.hernandez;

import com.hernandez.excepciones.ErrorValidacion;
public class Turista {


    public String nombre;
    public String telefono;
    public int contador = 1;



    public void setNombre(String nombre) throws ErrorValidacion {
        if (nombre.length()>50){
            throw new  ErrorValidacion("El nombre es demasiado largo");}
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) throws ErrorValidacion {
        if (!telefono.matches("[0-9]{4}\\-?[0-9]{4}")) {
            throw new ErrorValidacion("El numero de telefono es invalido");
        }
        this.telefono = telefono;
    }

    public int getContador() {

        return contador;
    }

    public void setContador(int contador) {
        this.contador += contador;
    }
}