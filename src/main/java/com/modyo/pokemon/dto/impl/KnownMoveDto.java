package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class KnownMoveDto implements Serializable {

    private static final long serialVersionUID = -1228626521733047329L;
    private String name;
    private String url;

}
