package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MoviesDto implements Serializable {

    private static final long serialVersionUID = 2613225486059700125L;
    private MoveDto move;
    private List<VersionGroupDetailsDto> version_group_details;
}
