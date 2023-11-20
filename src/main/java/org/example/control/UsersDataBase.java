package org.example.control;

import org.example.model.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UsersDataBase {
    public Connection connect(String path) {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:" + path + "/UsersRatings.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established.");
            return conn;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public void createTable(Statement statement) throws SQLException {
        statement.execute("CREATE TABLE IF NOT EXISTS UsersRatings (" +
                "UserName TEXT,\n" +
                "RelacionCalidadPrecio INTEGER,\n" +
                "Ubicacion INTEGER,\n" +
                "Servicio INTEGER,\n" +
                "Habitaciones INTEGER,\n" +
                "Limpieza INTEGER,\n" +
                "CalidadSueño INTEGER, " +
                "AñoEstancia INTEGER" +
                ");"
        );
    }

    public void insert(Statement statement, User user) throws SQLException {
        statement.execute("INSERT INTO UsersRatings" +
                " (UserName, RelacionCalidadPrecio, Ubicacion, Servicio, Habitaciones, Limpieza, CalidadSueño, " +
                "AñoEstancia)\n" +
                "VALUES('" + user.getUserName() + "'," + user.getCalidadPrecio() + "," +
                user.getUbicacion() + "," + user.getServicio() + "," + user.getHabitaciones() + "," +
                user.getLimpieza() + "," + user.getCalidadSueno() + ", " + user.getYear() +
                ");"
        );
    }
}
