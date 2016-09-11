package Model;


public abstract class Cliente {
    protected Integer numero;
    protected String nome;
    protected String cpf;
    
    protected Integer getnumero(){
        return numero;
    }
    
    protected String getnome(){
        return nome;
    }
    protected String getcpf(){
        return cpf;
    }
    protected void setnumero(Integer numero){
        this.numero=numero;
    }
    
    protected void setnome(String nome){
        this.nome=nome;
    }
    protected void setcpf(String cpf){
        this.cpf=cpf;
    }
}
