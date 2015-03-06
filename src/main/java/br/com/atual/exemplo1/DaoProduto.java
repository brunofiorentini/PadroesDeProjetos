/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atual.exemplo1;

/**
 *
 * @author Alunos
 */
public class DaoProduto extends Dao{
    
    @Override
    protected Boolean valida(IBean entidade){
        
        Produto pro = (Produto) entidade;
        if (pro.getId() != null) {
            return true;
        }
        return false;
    }
}
