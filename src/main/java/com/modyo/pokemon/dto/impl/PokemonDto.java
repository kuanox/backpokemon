package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PokemonDto implements Serializable {

    private static final long serialVersionUID = 6109907290171047145L;
    private List<AbilitiesDto> abilities;
    private int base_experience;
    private List<FormsDto> forms;
    private List<GameIndicesDto> game_indices;
    private int height;
    private List<?> held_items;
    private int id;
    private Boolean is_default;
    private String location_area_encounters;
    private List<MoviesDto> moves;
    private String name;
    private int order;
    private List<?> past_types;
    private SpeciesDto species;
    private SpritesDto sprites;
    private List<StatsDto> stats;
    private List<TypesDto> types;
    private int weight;

}
