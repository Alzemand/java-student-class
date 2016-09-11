package sistemacontroledeestoque;

public class Produto {
private Integer codigo;
private String ean;
private String descricao;
private Double precovenda;
private Integer quantidade;

public void setcodigo(Integer codigo){
    this.codigo =codigo;
}

public Integer setcodigo(){
    return this.codigo; 
}

public void setean(String ean){
    this.ean=ean;
}
public String setean(){
    return this.ean;
}

public void setdescricao(String descricao){
    this.descricao=descricao; 
}
public String setdescricao(){
   return this.descricao;
}

public void setprecovenda(Double precovenda){
     this.precovenda=precovenda;
}
public Double setprecovenda(){
    return this.precovenda;
}
public void setquantidade(Integer quantidade){
    this.quantidade=quantidade;
}
public Integer setquantidade(){
    return this.quantidade;
}
}
