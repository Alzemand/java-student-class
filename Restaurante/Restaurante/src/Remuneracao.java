
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Remuneracao
{
    private Calendar mes;
    private Double rendaTotal;
    private Double gratificacao;
    private Double salario;
   
    public void setMes(Calendar mes) 
    {
        this.mes = mes;
    }

    public void setRendaTotal(Double rendaTotal) 
    {
        this.rendaTotal = rendaTotal;
    }

    public void setGratificacao(Double gratificacao) 
    {
        this.gratificacao = gratificacao;
    }

    public void setSalario(Double salario) 
    {
        this.salario = salario;
    }

    public Calendar getMes() 
    {
        return mes;
    }

    public Double getRendaTotal() 
    {
        return rendaTotal;
    }

    public Double getGratificacao() 
    {
        return gratificacao;
    }

    public Double getSalario() 
    {
        return salario;
    }
}
