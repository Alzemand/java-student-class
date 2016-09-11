/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Victor
 */
public abstract class Professor extends Cliente{
    String formacao;
    
    private String getformacao(){
        return formacao;
    }
    
    private void setformacao(String formacao){
        this.formacao=formacao;   
    }
    
}
