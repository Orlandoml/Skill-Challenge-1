package com.metaphorce.vista;

import com.metaphorce.modelo.GestorPelicula;
import com.metaphorce.modelo.Pelicula;

public class Main {
    public static void main(String[] args) {

        GestorPelicula gestor = new GestorPelicula();

        Pelicula p1 = new Pelicula(1, "Toy Story", true);
        Pelicula p3 = new Pelicula(2, "Toy Story 2", true);
        Pelicula p2 = new Pelicula(3, "Mad Max", false);

        gestor.agregarPelicula(p1);
        gestor.agregarPelicula(p2);
        gestor.agregarPelicula(p3);

        gestor.eliminarPelicula(1);

        gestor.marcarPeliculaComoDisponible(2);

        System.out.println("Películas NO disponibles:");
        for (Pelicula p : gestor.obtenerPeliculasNoDisponibles()) {
            System.out.println(p);
        }

        System.out.println("\nLista de todas las películas:");
        for (Pelicula p : gestor.obtenerPeliculas()) {
            System.out.println(p);
        }
    }
}

