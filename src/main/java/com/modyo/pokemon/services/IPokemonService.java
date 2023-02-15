package com.modyo.pokemon.services;

import com.modyo.pokemon.dto.PokemonBaseDto;
import com.modyo.pokemon.dto.impl.EvolutionChainDto;
import com.modyo.pokemon.dto.impl.PokemonDto;
import com.modyo.pokemon.dto.impl.PokemonSpeciesDto;

public interface IPokemonService {

    public PokemonBaseDto getAllPokemons(String limit, String offset);
    public PokemonDto getInfoPokemonByName(String  pokemonName);
    public EvolutionChainDto getInfoEvolutionById(Integer pokemonId);
    public PokemonSpeciesDto getInfoSpecieById(Integer pokemonId);
    public EvolutionChainDto getInfoEvolutionByUrlEvolution(String evolutionUrl);

}
