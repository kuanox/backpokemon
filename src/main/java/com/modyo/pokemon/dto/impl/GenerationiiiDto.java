package com.modyo.pokemon.dto.impl;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenerationiiiDto implements Serializable {

    private EmeraldDto emerald;
    @Name("firered-leafgreen")
    private FireredLeafgreenDto firered_leafgreen;
    @Name("ruby-sapphire")
    private RubySapphireDto ruby_sapphire;


}
