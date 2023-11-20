package org.example.control;

import org.example.model.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInsert {

    private Scanner scanner;
    private UsersDataBase usersDataBase;

    public UserInsert() {
        this.scanner = new Scanner(System.in);
        this.usersDataBase = new UsersDataBase();
    }

    public void obtainUsers(String path) throws SQLException {
        Connection connection = getUsersDataBase().connect(path);
        Statement statement = connection.createStatement();
        getUsersDataBase().createTable(statement);

        while (true) {
            System.out.println();
            System.out.println("1. Introducir usuario");
            System.out.println("2. Salir");
            System.out.print("Usted selecciona: ");
            System.out.println();

            String choiceStr = getScanner().nextLine();

            switch (choiceStr) {
                case "1":
                    System.out.print("Inserta User Name: ");
                    String userName = getScanner().nextLine();
                    System.out.println();

                    System.out.print("Inserta Puntuacion Calidad Precio: ");
                    int calidadPrecio = Integer.parseInt(getScanner().nextLine());
                    System.out.println();

                    System.out.print("Inserta Puntuacion Ubicacion:");
                    int ubicacion = Integer.parseInt(getScanner().nextLine());
                    System.out.println();

                    System.out.print("Inserta Puntuacion Servicio: ");
                    int servicio = Integer.parseInt(getScanner().nextLine());
                    System.out.println();

                    System.out.print("Inserta Puntuacion Habitaciones: ");
                    int habitaciones = Integer.parseInt(getScanner().nextLine());
                    System.out.println();

                    System.out.print("Inserta Puntuacion Limpieza: ");
                    int limpieza = Integer.parseInt(getScanner().nextLine());
                    System.out.println();

                    System.out.print("Inserta Puntuacion Calidad Sueño: ");
                    int calidadSueno = Integer.parseInt(getScanner().nextLine());
                    System.out.println();

                    System.out.print("Inserta Año de Estadía: ");
                    int year = getScanner().nextInt();
                    System.out.println();

                    User user = new User(userName, calidadPrecio, ubicacion, servicio, habitaciones,
                            limpieza, calidadSueno, year);
                    getUsersDataBase().insert(statement, user);
                    break;

                case "2":
                    System.out.println("Saliendo...");
                    System.exit(0);
                    break;
            }

        }
    }

    public Scanner getScanner() {
        return scanner;
    }

    public UsersDataBase getUsersDataBase() {
        return usersDataBase;
    }
}
