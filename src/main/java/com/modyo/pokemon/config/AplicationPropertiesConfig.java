package com.modyo.pokemon.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class AplicationPropertiesConfig {

    @Value("${service.url.pokemon.api.getall}")
    private String serviceUrlPokemonApiGetAll;
    @Value("${service.url.pokemon.api.getone}")
    private String serviceUrlPokemonApiGetOne;
    @Value("${service.url.pokemon.api.getevolutionone}")
    private String serviceUrlPokemonApiGetEvolutionOne;
    @Value("${service.url.pokemon.api.getspecieone}")
    private String serviceUrlPokemonApiGetSpecieOne;

}
