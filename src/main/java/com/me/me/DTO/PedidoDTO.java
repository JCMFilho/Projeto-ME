package com.me.me.DTO;

import java.util.List;

public class PedidoDTO {
	
	private Integer pedido;
	
	private List<ItemDTO> itens;

	public Integer getPedido() {
		return pedido;
	}

	public void setPedido(Integer pedido) {
		this.pedido = pedido;
	}

	public List<ItemDTO> getItens() {
		return itens;
	}

	public void setItens(List<ItemDTO> itens) {
		this.itens = itens;
	}
}
