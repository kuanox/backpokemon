package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EvolutionDetailsDto implements Serializable {

    private static final long serialVersionUID = 1180473827087184781L;
    private String gender;
    private HeldItemDto held_item;
    private ItemDto item;
    private KnownMoveDto known_move;
    private KnownMoveTypeDto known_move_type;
    private LocationDto location;
    private String min_affection;
    private String min_beauty;
    private String min_happiness;
    private String min_level;
    private String needs_overworld_rain;
    private PartySpeciesDto party_species;
    private String party_type;
    private String relative_physical_stats;
    private String time_of_day;
    private String trade_species;
    private TriggerDto trigger;
    private Boolean turn_upside_down;

}
