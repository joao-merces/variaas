package Model.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_venda")
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long vendaId;

    @Column(name = "vend_met_pagamento", nullable = false)
    private String vendaMetodoPagamento;

    @Column(name = "vend_total", nullable = false)
    private Float vendaTotal;

    //chave do livros pedidos MUITOS
    @ManyToOne(optional = false)
    @JoinColumn(name = "venda_livPed_id")
    private Livros_Pedidos vendaLivrosPedidosId;

    public Long getVendaId() {
        return vendaId;
    }

    public void setVendaId(Long vendaId) {
        this.vendaId = vendaId;
    }

    public String getVendaMetodoPagamento() {
        return vendaMetodoPagamento;
    }

    public void setVendaMetodoPagamento(String vendaMetodoPagamento) {
        this.vendaMetodoPagamento = vendaMetodoPagamento;
    }

    public Float getVendaTotal() {
        return vendaTotal;
    }

    public void setVendaTotal(Float vendaTotal) {
        this.vendaTotal = vendaTotal;
    }

    public Livros_Pedidos getVendaLivrosPedidosId() {
        return vendaLivrosPedidosId;
    }

    public void setVendaLivrosPedidosId(Livros_Pedidos vendaLivrosPedidosId) {
        this.vendaLivrosPedidosId = vendaLivrosPedidosId;
    }
}