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
public class OracleProdutoDAO implements IProdutoDAO{
    @Override
    public void inserir(Produto produto){
        System.out.println("Inserido no Oracle!");
    }
    
    @Override
    public void atualizar(Produto produto){
        System.out.println("Atualizado no Oracle!");
    }
    
    @Override
    public void deletar(int id){
        System.out.println("Deletado no Oracle!");

    }
    
    @Override
    public List<Produto> listar(){
        System.out.println("Listado no Oracle!");
        return new ArrayList<>();
    }
}