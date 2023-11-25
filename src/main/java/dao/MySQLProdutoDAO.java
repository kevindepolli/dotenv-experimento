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
public class MySQLProdutoDAO implements IProdutoDAO{
    @Override
    public void inserir(Produto produto){
        System.out.println("Inserido no MySQL!");
    }
    
    @Override
    public void atualizar(Produto produto){
        System.out.println("Atualizado no MySQL!");
    }
    
    @Override
    public void deletar(int id){
        System.out.println("Deletado no MySQL!");

    }
    
    @Override
    public List<Produto> listar(){
        System.out.println("Listado no MySQL!");
        return new ArrayList<>();
    }
}