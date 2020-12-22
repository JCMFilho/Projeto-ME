package com.me.me.DTO;

public class StatusDTO {

	private String status;
	
	private Integer itensAprovados;
	
	private Integer valorAprovado;
	
	private Integer pedido;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getItensAprovados() {
		return itensAprovados;
	}

	public void setItensAprovados(Integer itensAprovados) {
		this.itensAprovados = itensAprovados;
	}

	public Integer getValorAprovado() {
		return valorAprovado;
	}

	public void setValorAprovado(Integer valorAprovado) {
		this.valorAprovado = valorAprovado;
	}

	public Integer getPedido() {
		return pedido;
	}

	public void setPedido(Integer pedido) {
		this.pedido = pedido;
	}
}
