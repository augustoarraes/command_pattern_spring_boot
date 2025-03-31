package com.projeto.delivery.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PEDIDO")
public class PedidoModel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "data_criacao")
	private LocalDateTime dataCriacao;
	
	@Column(name = "data_atualizacao")
	private LocalDateTime dateAtualizacao;
	
	private String status;
	private String label;

	@Column(name = "id_itens", nullable = false)
	private long idItens;

	@Column(name = "id_cliente", nullable = false)
	private long idCliente;

	@Column(name = "id_entregador", nullable = false)
	private long idEntregador;

	@Column(name = "id_fornecedor", nullable = false)
	private long idFornecedor;

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
