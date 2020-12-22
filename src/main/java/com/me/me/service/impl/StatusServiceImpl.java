package com.me.me.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.me.me.DTO.StatusDTO;
import com.me.me.DTO.StatusRetornoDTO;
import com.me.me.model.ItemPedido;
import com.me.me.model.Pedido;
import com.me.me.repository.PedidoRepository;
import com.me.me.service.StatusService;

@Service
public class StatusServiceImpl implements StatusService{

	private final PedidoRepository pedidoRepository;
	
	public StatusServiceImpl(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}
	
	@Override
	public StatusRetornoDTO retornaStatus(StatusDTO status) {
		StatusRetornoDTO retorno = new StatusRetornoDTO();
		List<String> stat = new ArrayList<>();
		retorno.setPedido(status.getPedido());
		if(this.pedidoRepository.existsById(status.getPedido())) {
			if(status.getStatus().equals("REPROVADO")) {
				stat.add("REPROVADO");
			}else {
				Pedido pedido = this.pedidoRepository.getOne(status.getPedido());
				
				Integer qtdTotal = 0;
				Integer valorTotal = 0;
				for(ItemPedido item:pedido.getItens()) {
					qtdTotal +=item.getQtd();
					valorTotal+=(item.getPrecoUnitario().intValue() * item.getQtd());
				}
				if(qtdTotal == status.getItensAprovados() && valorTotal == status.getValorAprovado() && status.getStatus().equals("APROVADO")) {
					stat.add("APROVADO");
				}
				if(status.getStatus().equals("APROVADO") && status.getValorAprovado().intValue() < valorTotal) {
					stat.add("APROVADO_VALOR_A_MENOR");
				}
				if(status.getStatus().equals("APROVADO") && status.getItensAprovados() < qtdTotal) {
					stat.add("APROVADO_QTD_A_MENOR");
				}
				if(status.getStatus().equals("APROVADO") && status.getValorAprovado().intValue() > valorTotal) {
					stat.add("APROVADO_VALOR_A_MAIOR");
				}
				if(status.getStatus().equals("APROVADO") && status.getItensAprovados() > qtdTotal) {
					stat.add("APROVADO_QTD_A_MAIOR");
				}
			}
		}else {
			stat.add("CODIGO_PEDIDO_INVALIDO");
		}
		retorno.setStatus(stat);
		return retorno;
	}

}
