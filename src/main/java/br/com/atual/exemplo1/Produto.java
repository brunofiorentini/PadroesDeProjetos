/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.atual.exemplo1;

/**
 *
 * @author Alunos
 */
public class Produto extends Entidade implements IBean{
    
    private Integer idProduto;
    
    public Integer getId(){
        return idProduto;
    }
    public void setId(Integer id){
        this.idProduto = id;
    }

   
    
}
