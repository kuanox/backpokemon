package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CharacteristicDto implements Serializable {

    private static final long serialVersionUID = -1485098294427391941L;
    private DescriptionsDto descriptions;
    private int gene_modulo;
    private HighestStatDto highest_stat;
    private int id;
    private List<Integer> possible_values;

}
