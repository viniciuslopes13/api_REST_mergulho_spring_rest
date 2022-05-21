package com.algaworks.algalog.dto;

import java.time.OffsetDateTime;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OcorrenciaInputDTO {
	
	@NotBlank
	private String descricao;
	
}
