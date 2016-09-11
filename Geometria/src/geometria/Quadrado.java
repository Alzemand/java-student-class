
package geometria;

public class Quadrado {
private Ponto ponto1;
private Ponto ponto2;

public Quadrado(Ponto ponto1,Ponto ponto2){
    this.ponto1=ponto1;
    this.ponto2=ponto2;

}
public Ponto getponto1(){
    return ponto1;
}
 
public Ponto getponto2(){
    return ponto2;
}

public Double getArea(){
    Double lado=this.ponto1.getdistancia(this.ponto2);
    return Math.pow(lado,2);

}
public Double getPerimetro(){
    Double lado=this.ponto1.getdistancia(this.ponto2);
    return (lado+lado+lado+lado);
}
}
