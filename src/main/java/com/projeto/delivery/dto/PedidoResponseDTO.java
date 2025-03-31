package com.projeto.delivery.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.projeto.delivery.model.PedidoModel;

public class PedidoResponseDTO {

	private UUID id;
	private LocalDateTime dataCriacao;
	private LocalDateTime dateAtualizacao;
	private String status;
	private String label;

	private long idItens;
	private long idCliente;
	private long idEntregador;
	private long idFornecedor;
	
	
	public PedidoResponseDTO(PedidoModel pedidoModel) {
		this.id = pedidoModel.getId();
		this.dataCriacao = pedidoModel.getDataCriacao();
		this.dateAtualizacao = pedidoModel.getDateAtualizacao();
		this.status = pedidoModel.getStatus();
		this.label = pedidoModel.getLabel();
		this.idItens = pedidoModel.getIdItens();
		this.idCliente = pedidoModel.getIdCliente();
		this.idEntregador = pedidoModel.getIdEntregador();
		this.idFornecedor = pedidoModel.getIdFornecedor();
	}
	

	public PedidoResponseDTO() {
	}


	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(LocalDateTime dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDateTime getDateAtualizacao() {
		return dateAtualizacao;
	}

	public void setDateAtualizacao(LocalDateTime dateAtualizacao) {
		this.dateAtualizacao = dateAtualizacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public long getIdItens() {
		return idItens;
	}

	public void setIdItens(long idItens) {
		this.idItens = idItens;
	}

	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public long getIdEntregador() {
		return idEntregador;
	}

	public void setIdEntregador(long idEntregador) {
		this.idEntregador = idEntregador;
	}

	public long getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(long idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

}
