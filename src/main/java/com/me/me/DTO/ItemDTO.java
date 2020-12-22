package com.me.me.DTO;

import java.math.BigInteger;

public class ItemDTO {
	
	private String descricao;
	
	private BigInteger precoUnitario;
	
	private Integer qtd;

	public ItemDTO() {
		
	}
	
	public ItemDTO(String descricao, BigInteger precoUnitario, Integer qtd) {
		this.descricao = descricao;
		this.precoUnitario = precoUnitario;
		this.qtd = qtd;
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
