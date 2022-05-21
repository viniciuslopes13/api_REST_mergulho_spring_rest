package com.algaworks.algalog.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.algaworks.algalog.domain.model.Entrega;
import com.algaworks.algalog.dto.EntregaDTO;
import com.algaworks.algalog.dto.EntregaInputDTO;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class EntregaAssembler {

	private ModelMapper modelMapper;
	
	public EntregaDTO toModel(Entrega entrega) {
		return modelMapper.map(entrega, EntregaDTO.class);
	}
	
	public List<EntregaDTO> toCollectionModel(List<Entrega> entregas){
		return entregas.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
	
	public Entrega toEntity(EntregaInputDTO entregaInputDTO) {
		return modelMapper.map(entregaInputDTO, Entrega.class);
	}
	
	
}
