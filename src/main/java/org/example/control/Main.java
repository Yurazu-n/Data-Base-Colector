package org.example.control;

import org.example.model.User;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserInsert userInsert = new UserInsert();
        userInsert.obtainUsers(args[0]);
    }
}