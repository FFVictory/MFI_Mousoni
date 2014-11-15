package models;

import beans.Client;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

/**
 * Created by Sawa-Kvas on 15/11/2014.
 */
public class ClientModel {
    Connection connect;
    PreparedStatement preparedStatement;
    ResultSet resultSet;

    public Client getClient(int Id) {
        Client cl1 = new Client();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://musoni.c4leprqodag9.eu-west-1.rds.amazonaws.com:3306?"
                    + "user=student&password=cfg2014!");
            preparedStatement = connect.prepareStatement("select * from musoni.m_client where id = ?;");
            preparedStatement.setInt(1, Id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {


                // ALL THE SET METHODS OF cl1

            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

        return cl1;
    }

}
