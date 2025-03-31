package com.projeto.delivery.service.command;

import com.projeto.delivery.dto.PedidoCreateDTO;
import com.projeto.delivery.dto.PedidoResponseDTO;
import com.projeto.delivery.service.PedidoService;

public class CriarPedidoCommand implements PedidoCommand {
    private PedidoService pedidoService;
    private PedidoCreateDTO pedido;

    public CriarPedidoCommand(PedidoService pedidoService, PedidoCreateDTO pedido) {
        this.pedidoService = pedidoService;
        this.pedido = pedido;
    }

    @Override
    public PedidoResponseDTO execute() {
        return pedidoService.criarPedido(pedido);
    }
}

