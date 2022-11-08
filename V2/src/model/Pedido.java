package model;

import enums.MetodoPagamento;
import enums.SituacaoPedido;
import model.cliente.Cliente;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class Pedido {

    private long id;
    private SituacaoPedido situacao;
    private List<Item> itens;
    private Cliente cliente;
    private MetodoPagamento metodoPagamento;

    public Pedido(long id, SituacaoPedido situacao, List<Item> itens,
                  BigDecimal valor, Cliente cliente,
                  MetodoPagamento metodoPagamento) {
        this.id = id;
        this.situacao = situacao;
        this.itens = itens;
        this.cliente = cliente;
        this.metodoPagamento = metodoPagamento;
    }

    public void setSituacao(SituacaoPedido situacao) {
        this.situacao = situacao;
    }

    public SituacaoPedido getSituacao() {
        return situacao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public BigDecimal getValorTotal() {
        BigDecimal ValorTotal = new BigDecimal(0);
        for (Item item : itens){
            ValorTotal = ValorTotal.add(item.getValor());
        }
        return ValorTotal.setScale(2, RoundingMode.HALF_EVEN);
    }

}
