package com.modyo.pokemon.business;

import com.modyo.pokemon.dto.out.PokemonOutDto;

import java.util.List;

public interface IPokemonBusiness {

    List<PokemonOutDto> getAllPokemons(String limit, String offset);

}
