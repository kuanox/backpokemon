package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PokemonSpeciesDto implements Serializable {

    private static final long serialVersionUID = 7028679426245506559L;
    private EvolutionChainSpeciesDto evolution_chain;
    private List<DeneraDto> genera;


}
