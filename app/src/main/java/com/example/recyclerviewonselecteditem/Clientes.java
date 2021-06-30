package com.example.recyclerviewonselecteditem;

public class Clientes {
    private String nombre;
    private int edad;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Clientes(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public Clientes(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public String toString() {
        return nombre;
    }
}
