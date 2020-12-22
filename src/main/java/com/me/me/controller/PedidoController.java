package com.me.me.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.me.me.DTO.ItemPedidoDTO;
import com.me.me.DTO.PedidoDTO;
import com.me.me.model.ItemPedido;
import com.me.me.model.Pedido;
import com.me.me.service.PedidoService;

@RestController
@RequestMapping("/api/pedido")
@CrossOrigin
public class PedidoController {
	
	private final PedidoService pedidoService;
	
	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
	
	@GetMapping("/id/{id}")
	private ResponseEntity<PedidoDTO> buscarPedido(@PathVariable("id") Integer id){
		return ResponseEntity.ok(this.pedidoService.listaPedidos(id));
	}
	
	@PostMapping
	private ResponseEntity<HttpStatus> salvarPedido(@RequestBody List<ItemPedido> itensPedido){
		this.pedidoService.salvarPedido(itensPedido);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	private ResponseEntity<HttpStatus> apagarPedido(@PathVariable("id") Integer id){
		this.pedidoService.deletarPedido(id);
		return ResponseEntity.ok(HttpStatus.OK);
	}
	
	@PutMapping
	private ResponseEntity<HttpStatus> atualizarItem(@RequestBody ItemPedidoDTO item){
		this.pedidoService.atualizarPedido(item);
		return ResponseEntity.ok(HttpStatus.OK);
	}

}
