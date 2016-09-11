package sistemacontroledeestoque;

import java.util.Calendar;

public class Venda {

private Calendar data;
private Double valortotal;
private Integer numero;

public void setdata(Calendar data){
    this.data=data;
}
public Calendar setdata(){
    return this.data;
}

public void setvalortotal(Double valortotal){
    this.valortotal=valortotal;
}
public Double setvalortotal(){
    return this.valortotal;
}
public void setnumero(Integer numero){
    this.numero=numero;
}
public Integer setnumero(){
    return this.numero;
}
}
