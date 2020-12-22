package com.me.me.model;

import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "TABELA_ITEM_PEDIDO")
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer item;

	@JoinColumn(name = "pedido", referencedColumnName = "pedido")
	@ManyToOne
	private Pedido pedido;
	
	private String descricao;
	
	private BigInteger precoUnitario;
	
	private Integer qtd;

	public Integer getItem() {
		return item;
	}

	public void setItem(Integer item) {
		this.item = item;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
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
