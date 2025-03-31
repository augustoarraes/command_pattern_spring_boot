package com.projeto.delivery.dto;

import com.projeto.delivery.model.PedidoModel;

public class PedidoCreateDTO {

	private String label;

	private long idItens;
	private long idCliente;
	private long idEntregador;
	private long idFornecedor;
	
	
	public PedidoCreateDTO(PedidoModel pedidoModel) {
		this.label = pedidoModel.getLabel();
		this.idItens = pedidoModel.getIdItens();
		this.idCliente = pedidoModel.getIdCliente();
		this.idEntregador = pedidoModel.getIdEntregador();
		this.idFornecedor = pedidoModel.getIdFornecedor();
	}
	

	public PedidoCreateDTO() {
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
