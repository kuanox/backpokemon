package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EvolutionDto implements Serializable {

    private static final long serialVersionUID = 262934236291871651L;
    private String name;
    private String url_image_home;

}
