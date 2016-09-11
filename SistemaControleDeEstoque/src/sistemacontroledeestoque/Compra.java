
package sistemacontroledeestoque;

import java.util.Calendar;

public class Compra {
private Calendar data;
private Double valortotal;
private Integer numeronf;
private Integer serienf;

public void setdata(Calendar data){
    this.data =data;
}

public Calendar setdata(){
    return this.data; 
}

public void setvalortoal(Double valortotal){
    this.valortotal=valortotal;
    
}

public Double setvalortoal(){
    return this.valortotal;
 
}

public void setnumeronf(Integer numeronf){
    this.numeronf=numeronf;
    
}
    
public Integer setnumeronf(){
    return this.numeronf;
}

public void setserienf(Integer numeronf){
    this.serienf=serienf;
}

public Integer setserienf(){
    return this.serienf;
}
}
