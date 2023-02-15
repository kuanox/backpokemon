package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EvolutionToDto implements Serializable {

    private static final long serialVersionUID = 5045746081917548454L;
    private List<EvolutionDetailsDto> evolution_details;
    private List<EvolutionToDto> evolves_to;
    private Boolean is_baby;
    private SpeciesDto species;

}
