package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoveDto implements Serializable {

    private static final long serialVersionUID = -3954071726334791655L;
    private String name;
    private String url;

}
