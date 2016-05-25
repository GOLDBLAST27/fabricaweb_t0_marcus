/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MV
 */
class ConexaoFactory {

    static Connection getConnection() {
        //throw new UnsupportedOperationException("Not supported yet.");
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/fabricaweb", "postgres", "masterchave");
        } catch (SQLException ex) {
            //Relançando a Exception
            throw new RuntimeException(ex);
            //Logger.getLogger(ConexaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
    
}
