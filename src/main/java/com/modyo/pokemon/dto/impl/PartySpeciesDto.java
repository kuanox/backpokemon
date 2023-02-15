package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PartySpeciesDto implements Serializable {

    private static final long serialVersionUID = -5528269286531784748L;
    private String name;
    private String url;
}
