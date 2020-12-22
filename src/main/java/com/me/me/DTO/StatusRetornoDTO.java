package com.me.me.DTO;

import java.util.List;

public class StatusRetornoDTO {

	private Integer pedido;
	
	private List<String> status;

	public Integer getPedido() {
		return pedido;
	}

	public void setPedido(Integer pedido) {
		this.pedido = pedido;
	}

	public List<String> getStatus() {
		return status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
	}
}
