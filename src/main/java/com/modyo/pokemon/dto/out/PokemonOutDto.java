package com.modyo.pokemon.dto.out;

import com.modyo.pokemon.dto.impl.AbilitiesDto;
import com.modyo.pokemon.dto.impl.ChainDto;
import com.modyo.pokemon.dto.impl.EvolutionDto;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Setter
@Getter
public class PokemonOutDto implements Serializable {

    private static final long serialVersionUID = -8130649735404764272L;
    private int id;
    private String name;
    private String National;
    private List<String> type;
    private String species;
    private int height;
    private int weight;
    private List<AbilitiesDto> abilities;
    private String url_image_dream_worl;
    private String url_image_home;

    private int hp;
    private int attack;
    private int defense;
    private int special_attack;
    private int special_defense;
    private int speed;

    //private List<ChainDto> chain;
    private List<EvolutionDto> chain;
    private int chain_group;

}
