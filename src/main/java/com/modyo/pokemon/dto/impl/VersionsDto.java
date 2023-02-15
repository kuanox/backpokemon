package com.modyo.pokemon.dto.impl;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VersionsDto implements Serializable {

    private static final long serialVersionUID = 756696837113163687L;
    @Name("generation-i")
    private GenerationiDto generationi;
    @Name("generation-ii")
    private GenerationiiDto generationii;
    @Name("generation-iii")
    private GenerationiiiDto generationiii;
    @Name("generation-iv")
    private GenerationivDto generationiv;
    @Name("generation-v")
    private GenerationvDto generationv;
    @Name("generation-vi")
    private GenerationviDto generationvi;
    @Name("generation-vii")
    private GenerationviiDto generationvii;
    @Name("generation-viii")
    private GenerationviiiDto generationviii;

}
