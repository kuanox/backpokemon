package com.modyo.pokemon.dto.impl;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenerationviiDto implements Serializable {

    private static final long serialVersionUID = -6142157827326606769L;
    private IconsDto icons;
    @Name("ultra-sun-ultra-moon")
    private UltraSunUltraMoonDto ultra_sun_ultra_moon;

}
