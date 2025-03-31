package com.projeto.delivery.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.delivery.dto.PedidoCreateDTO;
import com.projeto.delivery.dto.PedidoResponseDTO;
import com.projeto.delivery.service.PedidoService;
import com.projeto.delivery.service.command.*;


@RestController
@RequestMapping("/pedido")
public class PedidoController {
	
	private final PedidoService pedidoService;

	public PedidoController(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}
	
	@PostMapping
	public ResponseEntity<PedidoResponseDTO> criarPedido(@RequestBody PedidoCreateDTO pedidoDto) {
		PedidoCommand pedidoCommand = new CriarPedidoCommand(pedidoService, pedidoDto);
        return ResponseEntity.status(HttpStatus.CREATED).body( pedidoCommand.execute() );		
	}
	
	@PutMapping("/pagar/{id}")
	public ResponseEntity<PedidoResponseDTO> pagarPedido(@PathVariable UUID id) {
		PedidoCommand pedidoCommand = new PagarPedidoCommand(pedidoService, id);
		return ResponseEntity.status(HttpStatus.OK).body( pedidoCommand.execute() );
	}
	
	@PutMapping("/preparar/{id}")
	public ResponseEntity<PedidoResponseDTO> prepararPedido(@PathVariable UUID id) {
		PedidoCommand pedidoCommand = new PrepararPedidoCommand(pedidoService, id);
		return ResponseEntity.status(HttpStatus.OK).body( pedidoCommand.execute() );
	}
	
	@PutMapping("/enviar/{id}")
	public ResponseEntity<PedidoResponseDTO> enviarPedido(@PathVariable UUID id) {
		PedidoCommand pedidoCommand = new EnviarPedidoCommand(pedidoService, id);
		return ResponseEntity.status(HttpStatus.OK).body( pedidoCommand.execute() );
	}
	
	@PutMapping("/entregar/{id}")
	public ResponseEntity<PedidoResponseDTO> entregarPedido(@PathVariable UUID id) {
		PedidoCommand pedidoCommand = new EntregarPedidoCommand(pedidoService, id);
		return ResponseEntity.status(HttpStatus.OK).body( pedidoCommand.execute() );
	}
	
	@PutMapping("/cancelar/{id}")
	public ResponseEntity<PedidoResponseDTO> cancelarPedido(@PathVariable UUID id) {
		PedidoCommand pedidoCommand = new CancelarPedidoCommand(pedidoService, id);
		return ResponseEntity.status(HttpStatus.OK).body( pedidoCommand.execute() );
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PedidoResponseDTO> acompanharPedido(@PathVariable UUID id) {
		PedidoCommand pedidoCommand = new AcompanharPedidoCommand(pedidoService, id);
		return ResponseEntity.status(HttpStatus.OK).body( pedidoCommand.execute() );
	}
	
	@GetMapping("/")
	public String index() {
		return "It's work!";
	}

}
