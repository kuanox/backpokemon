package com.modyo.pokemon.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PokemonBaseDto implements Serializable {

    private static final long serialVersionUID = -4320986084785684280L;
    private int count;
    private String next;
    private String previous;
    private List<PokemonNameDto> results;

}
