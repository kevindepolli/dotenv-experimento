/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ufes.dotenv.experimento;

import factory.*;
import dao.*;
import model.*;
import io.github.cdimascio.dotenv.Dotenv;
import java.util.List;

/**
 *
 * @author Kevin
 */
public class DotenvExperimento {
    
    public static void main(String[] args) {
   
        Dotenv dotenv = Dotenv.load();
        var SGBD_escolhido = "factory." + dotenv.get("SGBD") + "DAOFactory";
        
        IDAOFactory dbInstance = null;
        try {
            Class<?> clazz = Class.forName(SGBD_escolhido);
            dbInstance = (IDAOFactory) clazz.getDeclaredConstructor().newInstance();
            
        } catch(ClassNotFoundException e) {
            System.out.println("Nome de SGBD inválido");
        } catch(ReflectiveOperationException e) {
            e.printStackTrace();
        }
        
        IProdutoDAO produtoDAO = dbInstance.getProdutoDAO();
        
        // Inserir
        Produto produto = new Produto(1, 129.99, "Fone Bluetooth");
        produtoDAO.inserir(produto);
        
        // Atualizar
        produto.setValor(159.99);
        produtoDAO.atualizar(produto);
        
        // Listar
        List<Produto> lista = produtoDAO.listar();
        
        // Excluir
        produtoDAO.deletar(1);
    }
}