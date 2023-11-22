/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author Aluno
 */
public class OracleProdutoDAO implements ProdutoDAO{
    @Override
    public void inserir(Produto produto){
        System.out.println("Inseri no Oracle!");
    }
    
    @Override
    public void atualizar(Produto produto){
        System.out.println("atualiza no Oracle!");
    }
    
    @Override
    public void deletar(int id){
        System.out.println("deleta no Oracle!");

    }
    
    @Override
    public List<Produto> listar(){
        System.out.println("lista no Oracle!");
        return new ArrayList<>();
    }
}