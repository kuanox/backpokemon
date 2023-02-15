package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DreamWorldDto implements Serializable {

    private static final long serialVersionUID = -210895455083666749L;
    private String front_default;
    private String front_female;
}
