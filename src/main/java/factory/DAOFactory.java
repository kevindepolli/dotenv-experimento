/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dao.ProdutoDAO;

/**
 *
 * @author Aluno
 */
public interface DAOFactory {
    public ProdutoDAO getProdutoDAO();
}
