/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Fornecedor extends Pessoa {
    private String cnpj;
    private String contato;

    public String getCnpj() {
        return cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
    
}
