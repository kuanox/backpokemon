package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChainDto implements Serializable {

    private static final long serialVersionUID = -4705189471491949460L;
    private List<EvolutionDetailsDto> evolution_details;
    private List<EvolutionToDto> evolves_to;
    private Boolean is_baby;
    private SpeciesDto species;

}
