package com.modyo.pokemon.services;

import com.modyo.pokemon.config.AplicationPropertiesConfig;
import com.modyo.pokemon.dto.PokemonBaseDto;
import com.modyo.pokemon.dummy.Data;
import com.modyo.pokemon.services.impl.PokemonService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PokemonServiceTest {

    private String limit = "30";
    private String offset = "0";

    @InjectMocks
    private PokemonService pokemonService;

    @Mock
    private RestTemplate restTemplate;

    @Autowired
    private AplicationPropertiesConfig aplicationPropertiesConfig;

    private PokemonBaseDto pokemonBaseDto;


    @BeforeEach
    public void setUp() throws IOException {
        MockitoAnnotations.initMocks(this);
        //ReflectionTestUtils.setField(pokemonService, pokemonService.urlBasePokemonApi, "https://pokeapi.co/api/v2");
        Data data = new Data();
        pokemonBaseDto = data.getPokemonBaseDto();
    }

    @Test
    public void getBasePokemons() {
        ResponseEntity<PokemonBaseDto> response = new ResponseEntity<>(this.pokemonBaseDto, HttpStatus.OK);
        Mockito.when(restTemplate.exchange(
                Mockito.anyString(),
                Mockito.eq(HttpMethod.GET),
                Mockito.<HttpEntity<PokemonBaseDto>>any(),
                Mockito.<ParameterizedTypeReference<PokemonBaseDto>>any())
        ).thenReturn(response);
        assertNotNull(pokemonService.getAllPokemons(this.limit, this.offset));
    }

}
