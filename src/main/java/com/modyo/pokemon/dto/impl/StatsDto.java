package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StatsDto implements Serializable {

    private static final long serialVersionUID = -8591217518700270581L;
    private int base_stat;
    private int effort;
    private StatDto stat;

}
