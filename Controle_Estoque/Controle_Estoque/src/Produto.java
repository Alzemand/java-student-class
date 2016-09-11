/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aluno
 */
public class Produto {
    private Integer codigo;
    private String ean;
    private String descricao;
    private Double precoVenda;
    private Integer quantidade;

    public Integer getCodigo() {
        return codigo;
    }

    public String getEan() {
        return ean;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getPrecoVenda() {
        return precoVenda;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPrecoVenda(Double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
