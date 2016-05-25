/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fabricadeprogramador;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;
import java.sql.SQLException;

/**
 *
 * @author MV
 */
public class TestUsuarioDAO {

    /**
     *
     * @param args
     * @throws SQLException
     */
    public static void main(String[] args ) throws SQLException {
        testExcluir();
    }
    
        public static void testExcluir(){
            //Excluindo Usuário
        Usuario usu = new Usuario();
        usu.setId(4);
        
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.excluir(usu);

        System.out.println("Excluído com Sucesso!");
    }
    
    public static void testAlterar(){

        Usuario usu = new Usuario();
        usu.setId(4);
        usu.setNome("Jãozão da Silva");
        usu.setLogin("jzaoss");
        usu.setSenha("90908080");

        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.alterar(usu);

        System.out.println("Alterado com Sucesso!");
    }
    public static void testCadastrar(){
        //Criando o Usuário
        Usuario usu = new Usuario();
        usu.setNome("Jãozão");
        usu.setLogin("jzao");
        usu.setSenha("9090");
        
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.cadastrar(usu);
        
        System.out.println("Cadastrado com Sucesso!");
    }
}
    
