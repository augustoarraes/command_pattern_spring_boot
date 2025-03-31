package com.projeto.delivery.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.delivery.model.PedidoModel;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, UUID>{

}
