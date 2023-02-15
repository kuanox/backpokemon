package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SpeciesDto implements Serializable {

    private static final long serialVersionUID = 4903865655419685638L;
    private String name;
    private String url;

}
