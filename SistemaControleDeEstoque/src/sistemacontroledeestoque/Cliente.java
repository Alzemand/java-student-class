/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemacontroledeestoque;

/**
 *
 * @author victor
 */
public class Cliente extends Pessoa {
private String cpf;

public void setcpf(String cpf){
    this.cpf =cpf;
}

public String setcpf(){
    return this.cpf; 
}
    
}
