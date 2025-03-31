package com.projeto.delivery.service;

import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.projeto.delivery.dto.PedidoCreateDTO;
import com.projeto.delivery.dto.PedidoResponseDTO;
import com.projeto.delivery.model.PedidoModel;
import com.projeto.delivery.repository.PedidoRepository;

@Service
public class PedidoService {
	
	private final PedidoRepository pedidoRepository;

	public PedidoService(PedidoRepository pedidoRepository) {
		this.pedidoRepository = pedidoRepository;
	}
	
	@Transactional
	public PedidoResponseDTO criarPedido(PedidoCreateDTO pedido) {
        var pedidoModel = new PedidoModel();
        BeanUtils.copyProperties(pedido, pedidoModel);
        pedidoModel.setStatus("1 - Pedido Criado");
        pedidoModel.setDataCriacao( LocalDateTime.now(ZoneId.of("UTC")) );
        var pedidoSalvo = pedidoRepository.save(pedidoModel);

        var pedidoDTO = new PedidoResponseDTO(pedidoSalvo);
        return pedidoDTO;
    }

	public PedidoResponseDTO pagarPedido(UUID id) {
		return this.atualizaStatus("2 - Pedido Pago", id);
	}

	public PedidoResponseDTO prepararPedido(UUID id) {
		return this.atualizaStatus("3 - Preparando", id);
	}
	
	public PedidoResponseDTO enviarPedido(UUID id) {
		return this.atualizaStatus("4 - Enviando Pedido", id);
	}
	
	public PedidoResponseDTO entregarPedido(UUID id) {
		return this.atualizaStatus("5 - Pedido Entregue", id);
	}
	
	public PedidoResponseDTO cancelarPedido(UUID id) {
		return this.atualizaStatus("6 - Pedido Cancelado", id);
	}
	
	public PedidoResponseDTO acompanharPedido(UUID id) {
		var pedidoModel = pedidoRepository.findById(id);
		var pedidoDTO = new PedidoResponseDTO(pedidoModel.get());
		return pedidoDTO;
	}
	
	private PedidoResponseDTO atualizaStatus(String status, UUID id) {
		var pedidoModel = pedidoRepository.findById(id);
		pedidoModel.get().setStatus(status);
		pedidoModel.get().setDateAtualizacao(LocalDateTime.now(ZoneId.of("UTC")));
		var pedidoAtualizado = pedidoRepository.save(pedidoModel.get());
		
		var pedidoDTO = new PedidoResponseDTO(pedidoAtualizado);
		return pedidoDTO;
	}
}
