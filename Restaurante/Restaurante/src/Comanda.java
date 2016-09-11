


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Comanda 
{
    private Integer quantidade ;
    private Double valor;
    private Refeicao refeicao;

    public void setRefeicao(Refeicao refeicao) {
        this.refeicao = refeicao;
    }

    public Refeicao getRefeicao() {
        return refeicao;
    }

    public void setQuantidade(Integer quantidade)
    {
        this.quantidade = quantidade;
    }

    public void setValor(Double valor)
    {
        this.valor = valor;
    }

    public Integer getQuantidade() 
    {
        return quantidade;
    }

    public Double getValor()
    {
        return valor;
    }

    
}
