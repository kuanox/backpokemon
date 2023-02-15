package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FireredLeafgreenDto implements Serializable {

    private static final long serialVersionUID = -2980443943295566354L;
    private String back_default;
    private String back_shiny;
    private String front_default;
    private String front_shiny;

}
