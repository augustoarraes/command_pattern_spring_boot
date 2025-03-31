package com.projeto.delivery.service.command;

import java.util.UUID;

import com.projeto.delivery.dto.PedidoResponseDTO;
import com.projeto.delivery.service.PedidoService;

public class PrepararPedidoCommand implements PedidoCommand{
	
	private PedidoService pedidoService;
    private UUID pedidoId;

    public PrepararPedidoCommand(PedidoService pedidoService, UUID pedidoId) {
        this.pedidoService = pedidoService;
        this.pedidoId = pedidoId;
    }

    @Override
    public PedidoResponseDTO execute() {
        return pedidoService.prepararPedido(pedidoId);
    }

}
