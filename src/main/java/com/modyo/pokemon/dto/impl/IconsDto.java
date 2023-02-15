package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class IconsDto implements Serializable {

    private static final long serialVersionUID = -6212574845191530975L;
    private String front_default;
    private String front_female;

}
