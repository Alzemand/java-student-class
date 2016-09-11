
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
public class Venda {
    private Calendar data;
    private Double valorTotal;
    private Integer numero;
    private DetalheVenda detalheVenda;
    private Vendedor vendedo;
    private Cliente cliente;

    public Calendar getData() {
        return data;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public Integer getNumero() {
        return numero;
    }

    public DetalheVenda getDetalheVenda() {
        return detalheVenda;
    }

    public Vendedor getVendedo() {
        return vendedo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setDetalheVenda(DetalheVenda detalheVenda) {
        this.detalheVenda = detalheVenda;
    }

    public void setVendedo(Vendedor vendedo) {
        this.vendedo = vendedo;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
