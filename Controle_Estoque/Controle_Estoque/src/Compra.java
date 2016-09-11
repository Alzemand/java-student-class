
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
public class Compra {
    private Calendar data;
    private Double valorTotal;
    private Integer numeroNf;
    private Integer serieNf;
    private DetalheCompra detalheCompra;
    private Fornecedor fornecedo;

    public Calendar getData() {
        return data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public Integer getNumeroNf() {
        return numeroNf;
    }

    public Integer getSerieNf() {
        return serieNf;
    }

    public DetalheCompra getDetalheCompra() {
        return detalheCompra;
    }

    public Fornecedor getFornecedo() {
        return fornecedo;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setNumeroNf(Integer numeroNf) {
        this.numeroNf = numeroNf;
    }

    public void setSerieNf(Integer serieNf) {
        this.serieNf = serieNf;
    }

    public void setDetalheCompra(DetalheCompra detalheCompra) {
        this.detalheCompra = detalheCompra;
    }

    public void setFornecedo(Fornecedor fornecedo) {
        this.fornecedo = fornecedo;
    }
    
    
    
}
