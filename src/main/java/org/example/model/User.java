package org.example.model;

public class User {
    private String userName;
    private int calidadPrecio;
    private int ubicacion;
    private int servicio;
    private int habitaciones;
    private int limpieza;
    private int calidadSueno;
    private int year;

    public User(String userName, int calidadPrecio, int ubicacion, int servicio, int habitaciones, int limpieza,
                int calidadSueno, int year) {
        this.userName = userName;
        this.calidadPrecio = calidadPrecio;
        this.ubicacion = ubicacion;
        this.servicio = servicio;
        this.habitaciones = habitaciones;
        this.limpieza = limpieza;
        this.calidadSueno = calidadSueno;
        this.year = year;
    }

    public String getUserName() {
        return userName;
    }

    public int getCalidadPrecio() {
        return calidadPrecio;
    }

    public int getUbicacion() {
        return ubicacion;
    }

    public int getServicio() {
        return servicio;
    }

    public int getHabitaciones() {
        return habitaciones;
    }

    public int getLimpieza() {
        return limpieza;
    }

    public int getCalidadSueno() {
        return calidadSueno;
    }

    public int getYear() {return year;}
}
