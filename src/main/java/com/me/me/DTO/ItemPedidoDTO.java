package com.me.me.DTO;

import java.math.BigInteger;

public class ItemPedidoDTO {
	
    private Integer item;

	private Integer pedido;
	
	private String descricao;
	
	private BigInteger precoUnitario;
	
	private Integer qtd;

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public Integer getPedido() {
		return pedido;
	}

	public void setPedido(Integer pedido) {
		this.pedido = pedido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigInteger getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(BigInteger precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Integer getQtd() {
		return qtd;
	}

	public void setQtd(Integer qtd) {
		this.qtd = qtd;
	}
	
	
	
}
