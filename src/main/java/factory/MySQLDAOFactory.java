/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dao.MySQLProdutoDAO;
import dao.ProdutoDAO;

/**
 *
 * @author Aluno
 */
public class MySQLDAOFactory implements DAOFactory {
    @Override
    public ProdutoDAO getProdutoDAO() {
        return new MySQLProdutoDAO();
    }
}
