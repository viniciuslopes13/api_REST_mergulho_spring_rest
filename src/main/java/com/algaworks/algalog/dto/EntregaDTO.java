package com.algaworks.algalog.dto;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.algaworks.algalog.domain.model.StatusEntrega;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaDTO {
	
	private Long id;
	
	private ClienteResumoDTO cliente;
	
	private DestinatarioDTO  destinatario;
	
	private BigDecimal taxa;
	
	private StatusEntrega status;
	
	private OffsetDateTime dataPedido;
	
	private OffsetDateTime dataFinalizacao;

}
