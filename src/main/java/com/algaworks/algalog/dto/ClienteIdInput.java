package com.algaworks.algalog.dto;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClienteIdInput {

	@NotNull
	private Long id;
	
}
