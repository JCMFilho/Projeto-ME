package com.me.me.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.me.me.DTO.ItemDTO;
import com.me.me.model.ItemPedido;

@Repository
public interface ItemRepository extends JpaRepository<ItemPedido,Integer> {

	@Query("Select new com.me.me.DTO.ItemDTO(I.descricao,I.precoUnitario,I.qtd) from ItemPedido I where I.pedido.pedido =:id")
	public List<ItemDTO> buscarItensPorPedido(@Param("id")Integer id);
	
}
