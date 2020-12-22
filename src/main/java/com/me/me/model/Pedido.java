package com.me.me.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TABELA_PEDIDO")
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pedido;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pedido")
	private List<ItemPedido> itens;

	public Integer getPedido() {
		return pedido;
	}

	public void setPedido(Integer pedido) {
		this.pedido = pedido;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	

}
