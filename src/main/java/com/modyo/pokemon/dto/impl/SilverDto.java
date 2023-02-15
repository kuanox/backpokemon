package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SilverDto implements Serializable {

    private static final long serialVersionUID = -3343846371771707626L;
    private String back_default;
    private String back_shiny;
    private String front_default;
    private String front_shiny;
    private String front_transparent;

}
