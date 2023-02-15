package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OfficialArtworkDto implements Serializable {

    private static final long serialVersionUID = -2378528727299241503L;
    private String front_default;
    private String front_shiny;


}
