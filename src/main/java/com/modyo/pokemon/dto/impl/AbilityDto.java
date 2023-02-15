package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AbilityDto implements Serializable  {

    private static final long serialVersionUID = 5782259572060363653L;
    private String name;
    private String url;

}
