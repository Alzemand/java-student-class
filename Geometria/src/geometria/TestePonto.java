/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *  SET - ESCREVER;
 *  GET - LER;
 * @author aluno
 */
public class TestePonto {

    public static void main (String args[]){
        //ponto ->lase p=objeto; valor de p é null new ponto ele starta
        Ponto p=new Ponto(3.8,-5.2);
       // p.setX(3.8);
        //p.setY(-5.2);
        System.out.println(p.getX());
        System.out.println(p.getY());
    
       Ponto p2=new Ponto();
       // p.setX(3.8);
        //p.setY(-5.2);
        System.out.println(p2.getX());
        System.out.println(p2.getY());
        System.out.println(p.getdistancia(p2));
   }
}
   

// MÉTODO CONSTRUTO , NÃO POSSUI VALOR DE RETORNO E POSSUI O MSM VALOR DA CLASSE;
