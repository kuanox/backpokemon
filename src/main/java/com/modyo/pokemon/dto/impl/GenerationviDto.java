package com.modyo.pokemon.dto.impl;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenerationviDto implements Serializable {

    @Name("omegaruby-alphasapphire")
    private OmegarubyAlphasapphireDto omegaruby_alphasapphire;
    @Name("x-y")
    private XyDto x_y;

}
