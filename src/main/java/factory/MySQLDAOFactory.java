/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import dao.MySQLProdutoDAO;
import dao.IProdutoDAO;

/**
 *
 * @author Aluno
 */
public class MySQLDAOFactory implements IDAOFactory {
    @Override
    public IProdutoDAO getProdutoDAO() {
        return new MySQLProdutoDAO();
    }
}
