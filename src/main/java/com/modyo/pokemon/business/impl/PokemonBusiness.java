package com.modyo.pokemon.business.impl;

import com.modyo.pokemon.business.IPokemonBusiness;
import com.modyo.pokemon.dto.PokemonBaseDto;
import com.modyo.pokemon.dto.impl.*;
import com.modyo.pokemon.dto.out.PokemonOutDto;
import com.modyo.pokemon.services.IPokemonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class PokemonBusiness implements IPokemonBusiness {

    @Autowired
    private IPokemonService iPokemonService;

    @Override
    public List<PokemonOutDto> getAllPokemons(String limit, String offset) {
        List<PokemonOutDto> listPokemonOutDto = new ArrayList<>();
        List<PokemonDto> listPokemonDto = new ArrayList<>();
        PokemonBaseDto pokemonBaseDto = iPokemonService.getAllPokemons(limit, offset);
        pokemonBaseDto.getResults().stream().forEach(element -> {
            listPokemonDto.add(iPokemonService.getInfoPokemonByName(element.getName()));
        });
        for (PokemonDto element : listPokemonDto) {
            PokemonSpeciesDto pokemonSpeciesDto = iPokemonService.getInfoSpecieById(element.getId());
            EvolutionChainDto evolutionChainDto = iPokemonService.getInfoEvolutionByUrlEvolution(pokemonSpeciesDto.getEvolution_chain().getUrl());
            PokemonOutDto pokemonOutDto = new PokemonOutDto();
            pokemonOutDto.setId(element.getId());
            pokemonOutDto.setName(element.getName());
            pokemonOutDto.setNational(String.format("%04d", element.getId()));
            List<String> types = new ArrayList<>();
            for (TypesDto typesDto : element.getTypes()) {
                types.add(typesDto.getType().getName());
            }
            pokemonOutDto.setType(types);
            pokemonOutDto.setSpecies(pokemonSpeciesDto.getGenera().get(7).getGenus());
            pokemonOutDto.setHeight(element.getHeight());
            pokemonOutDto.setWeight(element.getWeight());
            List<AbilitiesDto> abilitiesDtos = new ArrayList<>();
            for (AbilitiesDto abilitiesDto : element.getAbilities()) {
                abilitiesDtos.add(abilitiesDto);
            }
            pokemonOutDto.setAbilities(abilitiesDtos);
            pokemonOutDto.setUrl_image_dream_worl(element.getSprites().getOther().getDream_world().getFront_default());
            pokemonOutDto.setUrl_image_home(element.getSprites().getOther().getHome().getFront_default());
            pokemonOutDto.setHp(element.getStats().get(0).getBase_stat());
            pokemonOutDto.setAttack(element.getStats().get(1).getBase_stat());
            pokemonOutDto.setDefense(element.getStats().get(2).getBase_stat());
            pokemonOutDto.setSpecial_attack(element.getStats().get(3).getBase_stat());
            pokemonOutDto.setSpecial_defense(element.getStats().get(4).getBase_stat());
            pokemonOutDto.setSpeed(element.getStats().get(5).getBase_stat());
            List<EvolutionDto> evo = new ArrayList<>();
            EvolutionDto evolution1Dto = new EvolutionDto();
            evolution1Dto.setName(evolutionChainDto.getChain().getSpecies().getName());
            listPokemonDto.stream().forEach(pokemon -> {
                if (evolution1Dto.getName().equals(pokemon.getName())) {
                    evolution1Dto.setUrl_image_home(pokemon.getSprites().getOther().getHome().getFront_default());
                }
            });
            evo.add(evolution1Dto);
            evolutionChainDto.getChain().getEvolves_to().stream().forEach(evolution2 -> {
                EvolutionDto evolution2Dto = new EvolutionDto();
                evolution2Dto.setName(evolution2.getSpecies().getName());
                listPokemonDto.stream().forEach(pokemon2 -> {
                    if (evolution2Dto.getName().equals(pokemon2.getName())) {
                        evolution2Dto.setUrl_image_home(pokemon2.getSprites().getOther().getHome().getFront_default());
                    }
                });
                evo.add(evolution2Dto);
                evolution2.getEvolves_to().stream().forEach(evolution3 -> {
                    EvolutionDto evolution3Dto = new EvolutionDto();
                    evolution3Dto.setName(evolution3.getSpecies().getName());
                    listPokemonDto.stream().forEach(pokemon3 -> {
                        if (evolution3Dto.getName().equals(pokemon3.getName())) {
                            evolution3Dto.setUrl_image_home(pokemon3.getSprites().getOther().getHome().getFront_default());
                        }
                    });
                    evo.add(evolution3Dto);
                });
            });
            pokemonOutDto.setChain_group(evolutionChainDto.getId());
            pokemonOutDto.setChain(evo);
            listPokemonOutDto.add(pokemonOutDto);
        }
        return listPokemonOutDto;
    }

}
