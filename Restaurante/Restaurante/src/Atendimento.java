
import java.util.Calendar;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Atendimento 
{
    private Calendar horaInicio;
    private Calendar horaFim;
    private Calendar data;
    private Double avaliacao;
    private Double valorTotal; 
    private Mesa mesa;
    private Garcon garcon;
    private List <Comanda> comanda;

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void setGarcon(Garcon garcon) {
        this.garcon = garcon;
    }

    public void setComanda(List<Comanda> comanda) {
        this.comanda = comanda;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public Garcon getGarcon() {
        return garcon;
    }

    public List<Comanda> getComanda() {
        return comanda;
    }
    
    public Calendar getHoraInicio()
    {
        return horaInicio;
    }

    public Calendar getHoraFim() 
    {
        return horaFim;
    }

    public Calendar getData()
    {
        return data;
    }

    public Double getAvaliacao() 
    {
        return avaliacao;
    }

    public Double getValorTotal()
    {
        return valorTotal;
    }

    public void setHoraInicio(Calendar horaInicio)
    {
        this.horaInicio = horaInicio;
    }

    public void setHoraFim(Calendar horaFim)
    {
        this.horaFim = horaFim;
    }

    public void setData(Calendar data)
    {
        this.data = data;
    }

    public void setAvaliacao(Double avaliacao)
    {
        this.avaliacao = avaliacao;
    }

    public void setValorTotal(Double valorTotal)
    {
        this.valorTotal = valorTotal;
    }
}
