package com.metaphorce.modelo;

public class Pelicula {
    private int id;
    private String nombre;
    private boolean disponible;

    public Pelicula(int id, String nombre, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", disponible=" + disponible +
                '}';
    }
}

