package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class VersionGroupDetailsDto implements Serializable {

    private static final long serialVersionUID = -1161635176410047926L;
    private int level_learned_at;
    private MoveLearnMethodDto move_learn_method;
    private VersionGroupDto version_group;

}
