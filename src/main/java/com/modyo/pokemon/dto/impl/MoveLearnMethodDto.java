package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoveLearnMethodDto implements Serializable {

    private static final long serialVersionUID = -2642505469776888937L;
    private String name;
    private String url;


}
