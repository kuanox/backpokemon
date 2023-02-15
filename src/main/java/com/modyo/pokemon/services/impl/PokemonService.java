package com.modyo.pokemon.services.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.modyo.pokemon.config.AplicationPropertiesConfig;
import com.modyo.pokemon.dto.PokemonBaseDto;
import com.modyo.pokemon.dto.impl.EvolutionChainDto;
import com.modyo.pokemon.dto.impl.PokemonDto;
import com.modyo.pokemon.dto.impl.PokemonSpeciesDto;
import com.modyo.pokemon.services.BaseServices;
import com.modyo.pokemon.services.IPokemonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class PokemonService extends BaseServices implements IPokemonService {

    @Autowired
    private AplicationPropertiesConfig aplicationPropertiesConfig;

    @Override
    public PokemonBaseDto getAllPokemons(String limit, String offset) {
        PokemonBaseDto responsePokemonBaseDto = new PokemonBaseDto();
        Map<String, String> params = new HashMap<>();
        params.put("limit", limit);
        params.put("offset", offset);
        Object responseGetAllObj = null;
        try {
            responseGetAllObj = super.get(this.urlBasePokemonApi, this.aplicationPropertiesConfig.getServiceUrlPokemonApiGetAll(), params);
            responsePokemonBaseDto = mapper.convertValue(responseGetAllObj, new TypeReference<PokemonBaseDto>(){ });
            log.info("response");
            log.info(responsePokemonBaseDto.toString());
        } catch (NullPointerException ex) {
            log.error(ex.getMessage());
        } catch (Exception ex) {
            log.error(ex.getStackTrace().toString());
        }
        return responsePokemonBaseDto;
    }

    @Override
    public PokemonDto getInfoPokemonByName(String pokemonName) {
        PokemonDto responsePokemonDto = new PokemonDto();
        Map<String, String> params = new HashMap<>();
        params.put("id", pokemonName);
        Object responseGetOneObj = null;
        try {
            responseGetOneObj = super.get(this.urlBasePokemonApi, this.aplicationPropertiesConfig.getServiceUrlPokemonApiGetOne(), params);
            responsePokemonDto = mapper.convertValue(responseGetOneObj, new TypeReference<PokemonDto>(){ });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responsePokemonDto;
    }

    @Override
    public EvolutionChainDto getInfoEvolutionById(Integer pokemonId) {
        EvolutionChainDto responseEvolutionChainDto = new EvolutionChainDto();
        Map<String, String> params = new HashMap<>();
        params.put("id", pokemonId.toString());
        Object responseGetOneObj = null;
        try {
            responseGetOneObj = super.get(this.urlBasePokemonApi, this.aplicationPropertiesConfig.getServiceUrlPokemonApiGetEvolutionOne(), params);
            responseEvolutionChainDto = mapper.convertValue(responseGetOneObj, new TypeReference<EvolutionChainDto>(){ });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseEvolutionChainDto;
    }

    @Override
    public PokemonSpeciesDto getInfoSpecieById(Integer pokemonId) {
        PokemonSpeciesDto responsePokemonSpeciesDto = new PokemonSpeciesDto();
        Map<String, String> params = new HashMap<>();
        params.put("id", pokemonId.toString());
        Object responseGetOneObj = null;
        try {
            responseGetOneObj = super.get(this.urlBasePokemonApi, this.aplicationPropertiesConfig.getServiceUrlPokemonApiGetSpecieOne(), params);
            responsePokemonSpeciesDto = mapper.convertValue(responseGetOneObj, new TypeReference<PokemonSpeciesDto>(){ });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responsePokemonSpeciesDto;
    }

    @Override
    public EvolutionChainDto getInfoEvolutionByUrlEvolution(String evolutionUrl) {
        EvolutionChainDto responseEvolutionChainDto = new EvolutionChainDto();
        Object responseGetOneObj = null;
        try {
            //log.info("evolutionUrl : " + evolutionUrl);
            responseGetOneObj = super.get(evolutionUrl);
            responseEvolutionChainDto = mapper.convertValue(responseGetOneObj, new TypeReference<EvolutionChainDto>(){ });
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return responseEvolutionChainDto;
    }


}
