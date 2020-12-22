package com.me.me.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.me.me.DTO.ItemPedidoDTO;
import com.me.me.DTO.PedidoDTO;
import com.me.me.model.ItemPedido;
import com.me.me.model.Pedido;
import com.me.me.repository.ItemRepository;
import com.me.me.repository.PedidoRepository;
import com.me.me.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService{

	private final PedidoRepository pedidoRepository;
	private final ItemRepository itemRepository;
	
	public PedidoServiceImpl(PedidoRepository pedidoRepository,ItemRepository itemRepository) {
		this.pedidoRepository = pedidoRepository;
		this.itemRepository = itemRepository;
	}
	
	@Override
	public void salvarPedido(List<ItemPedido> itemPedido) {
		Pedido pedido = new Pedido();
		pedido = this.pedidoRepository.saveAndFlush(pedido);
		for(ItemPedido item:itemPedido) {
			item.setPedido(pedido);
		}
		pedido.setItens(itemPedido);
		this.pedidoRepository.saveAndFlush(pedido);
		
	}

	@Override
	public PedidoDTO listaPedidos(Integer id) {
		PedidoDTO pedido = new PedidoDTO();
		pedido.setPedido(id);
		pedido.setItens(this.itemRepository.buscarItensPorPedido(id));
		return pedido;
	}

	@Override
	public void deletarPedido(Integer id) {
		this.pedidoRepository.deleteById(id);
	}

	@Override
	public void atualizarPedido(ItemPedidoDTO itemPedido) {
		ItemPedido item = new ItemPedido();
		Pedido pedido = new Pedido();
		pedido.setPedido(itemPedido.getPedido());
		item.setPedido(pedido);
		item.setDescricao(itemPedido.getDescricao());
		item.setItem(itemPedido.getItem());
		item.setPrecoUnitario(itemPedido.getPrecoUnitario());
		item.setQtd(itemPedido.getQtd());
		this.itemRepository.saveAndFlush(item);
	}


}
