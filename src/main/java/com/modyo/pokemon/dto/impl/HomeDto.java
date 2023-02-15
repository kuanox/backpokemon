package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HomeDto implements Serializable  {

    private static final long serialVersionUID = 6566523822961304343L;
    private String front_default;
    private String front_female;
    private String front_shiny;
    private String front_shiny_female;

}
