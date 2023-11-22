/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Produto;

/**
 *
 * @author Aluno
 */
public interface ProdutoDAO {
    public void inserir(Produto produto);
    public void atualizar(Produto produto);
    public void deletar(int id);
    public List<Produto> listar();
}

