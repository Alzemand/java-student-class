package sistemacontroledeestoque;

public class Fornecedor extends Pessoa{
private String cnpj;
private String contato;

  public void setcnpj(String cnpj) {
        this.cnpj=cnpj;
    }
     public String getcnpj (){
        return this.cnpj;
    }
    public void setcontato(String contato){
        this.contato=contato;
    }
    public String getcontato(){
        return this.contato;
    }    
    
}
