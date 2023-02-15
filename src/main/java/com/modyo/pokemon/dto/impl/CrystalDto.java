package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CrystalDto implements Serializable {

    private static final long serialVersionUID = -3997696084739412456L;
    private String back_default;
    private String back_shiny;
    private String back_shiny_transparent;
    private String back_transparent;
    private String front_default;
    private String front_shiny;
    private String front_shiny_transparent;
    private String front_transparent;

}
