package com.me.me.service;

import java.util.List;

import com.me.me.DTO.ItemPedidoDTO;
import com.me.me.DTO.PedidoDTO;
import com.me.me.model.ItemPedido;

public interface PedidoService {

	void salvarPedido(List<ItemPedido> itemPedido);
	
	PedidoDTO listaPedidos(Integer id);
	
	void deletarPedido(Integer id);
	
	void atualizarPedido(ItemPedidoDTO itemPedido);
}
