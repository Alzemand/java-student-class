/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author aluno
 */
public class Ponto {

    private Double x;
    private Double y;

    public Ponto(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto() {
        this.x = 0.0;
        this.y = 0.0;
    }

    /**
     * @return the x
     */
    public Double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(Double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Double y) {
        this.y = y;
    }
    public Double getdistancia(Ponto p){
       double d= Math.sqrt(Math.pow(p.getX() - this.x,2)+Math.pow(p.getY()-this.y,2));
       return d;
    }
}
