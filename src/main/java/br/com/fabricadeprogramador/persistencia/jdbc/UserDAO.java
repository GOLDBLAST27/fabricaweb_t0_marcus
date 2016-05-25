/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fabricadeprogramador.persistencia.jdbc;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author MV
 */
public class UserDAO {
    //private Connection conx = ConexaoFactory.getConnection();
   /* public void cadastrar(Usuario user){
        String sql = "insert into usuario(nome, login, senha) values (?, ?, ?)";
            
        try (PreparedStatement preparador = conx.prepareStatement(sql)) {
            preparador.setString(1, user.getNome());//Substitui o ?
            preparador.setString(2, user.getLogin());
            preparador.setString(3, user.getSenha());
            preparador.execute();
            preparador.close();
            
            
        } catch (SQLException e) {
*/
        }
