package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenerationiiDto implements Serializable {

    private static final long serialVersionUID = 1329714405141654050L;
    private CrystalDto crystal;
    private GoldDto gold;
    private SilverDto silver;

}
