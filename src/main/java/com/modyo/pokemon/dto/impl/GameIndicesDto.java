package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GameIndicesDto implements Serializable  {

    private static final long serialVersionUID = -2024192528818511225L;
    private int game_index;
    private VersionDto version;


}
