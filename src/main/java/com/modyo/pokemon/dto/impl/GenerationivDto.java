package com.modyo.pokemon.dto.impl;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenerationivDto implements Serializable {

    @Name("diamond-pearl")
    private DiamondPearlDto diamond_pearl;
    @Name("heartgold-soulsilver")
    private HeartgoldSoulsilverDto heartgold_soulsilver;
    private PlatinumDto platinum;

}
