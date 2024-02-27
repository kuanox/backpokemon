package com.modyo.pokemon.services;

import com.modyo.pokemon.dto.PokemonBaseDto;
import com.modyo.pokemon.dto.impl.EvolutionChainDto;
import com.modyo.pokemon.dto.impl.PokemonDto;
import com.modyo.pokemon.dto.impl.PokemonSpeciesDto;

public interface IPokemonService {

    PokemonBaseDto getAllPokemons(String limit, String offset);
    PokemonDto getInfoPokemonByName(String  pokemonName);
    EvolutionChainDto getInfoEvolutionById(Integer pokemonId);
    PokemonSpeciesDto getInfoSpecieById(Integer pokemonId);
    EvolutionChainDto getInfoEvolutionByUrlEvolution(String evolutionUrl);

}
