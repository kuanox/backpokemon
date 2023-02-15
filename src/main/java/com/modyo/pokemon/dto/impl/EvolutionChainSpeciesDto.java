package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EvolutionChainSpeciesDto implements Serializable {

    private static final long serialVersionUID = -158807076724748794L;
    private String url;

}
