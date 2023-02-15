package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class KnownMoveTypeDto implements Serializable {

    private static final long serialVersionUID = -2179155512310421190L;
    private String name;
    private String url;

}
