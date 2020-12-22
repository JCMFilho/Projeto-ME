package com.me.me.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.me.me.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,Integer>{

}
