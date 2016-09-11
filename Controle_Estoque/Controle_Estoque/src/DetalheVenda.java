
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
public class DetalheVenda {
    private Integer quantidade;
    private Double precoVenda;
    private List <Produto> produto;

    public Integer getQuantidade() {
        return quantidade;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
    
    
}
