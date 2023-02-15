package com.modyo.pokemon.dto;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PokemonNameDto implements Serializable {

    private static final long serialVersionUID = -4050956821772545414L;
    private String name;
    private String url;

}
