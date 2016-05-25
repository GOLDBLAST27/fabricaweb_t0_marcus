/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fabricadeprogramador.persistencia.jdbc;


import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MV
 */
public class UsuarioDAO{
    private Connection con = ConexaoFactory.getConnection();
   //public Connection conx =new  ConexaoFactory.getConnection();
    /**
     *
     * @param usu
     */  
    public void cadastrar(Usuario usu) {
       
       String sql = "insert into usuario(nome, login, senha) values (?,?,?)";
        //Criando um Statement
         try(PreparedStatement preparador = con.prepareStatement(sql)){
           preparador.setString(1, usu.getNome()); //Substitui o '?' pelo dado do usuario
           preparador.setString(2, usu.getLogin());
           preparador.setString(3, usu.getSenha());
           
           preparador.execute();// Executa o comando no banco
           
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
    }

    public void alterar(Usuario usu) {
        String sql = "update usuario set nome=?, login=?, senha=? where id=? ";
        //Criando um Statement
         try(PreparedStatement preparador = con.prepareStatement(sql)){
           preparador.setString(1, usu.getNome()); //Substitui o '?' pelo dado do usuario
           preparador.setString(2, usu.getLogin());
           preparador.setString(3, usu.getSenha());
           preparador.setInt(4, usu.getId());
           
           preparador.execute();// Executa o comando no banco
           
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void excluir(Usuario usu) {
        String sql = "delete from usuario where id=? ";
        //Criando um Statement
         try(PreparedStatement preparador = con.prepareStatement(sql)){
           preparador.setInt(1, usu.getId()); 
           preparador.execute();// Executa o comando no banco
           
         } catch (SQLException ex) {
             Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
       
    }
}
