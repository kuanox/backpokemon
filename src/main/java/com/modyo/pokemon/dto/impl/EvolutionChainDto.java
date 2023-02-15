package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EvolutionChainDto implements Serializable {

    private static final long serialVersionUID = -607658918252902848L;
    private BabyTriggerItemDto baby_trigger_item;
    private ChainDto chain;
    private int id;

}
