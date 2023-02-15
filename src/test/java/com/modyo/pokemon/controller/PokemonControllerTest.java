package com.modyo.pokemon.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.modyo.pokemon.business.impl.PokemonBusiness;
import com.modyo.pokemon.dto.out.PokemonOutDto;
import com.modyo.pokemon.dummy.Data;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PokemonControllerTest {

    private String limit = "30";
    private String offset = "0";

    @InjectMocks
    private PokemonController pokemonController;

    @Mock
    private PokemonBusiness pokemonBusiness;

    private Gson gson = new Gson();

    private List<PokemonOutDto> pokemonOutDtos;

    private JsonArray groupJsonArray;

    @Before
    public void setUp() throws IOException {
        MockitoAnnotations.initMocks(this);
        Data data = new Data();
        String groupsJson = "[ {\n" +
                "        \"id\": 1,\n" +
                "        \"name\": \"bulbasaur\",\n" +
                "        \"type\": [\n" +
                "            \"grass\",\n" +
                "            \"poison\"\n" +
                "        ],\n" +
                "        \"species\": \"Seed Pokémon\",\n" +
                "        \"height\": 7,\n" +
                "        \"weight\": 69,\n" +
                "        \"abilities\": [\n" +
                "            {\n" +
                "                \"ability\": {\n" +
                "                    \"name\": \"overgrow\",\n" +
                "                    \"url\": \"https://pokeapi.co/api/v2/ability/65/\"\n" +
                "                },\n" +
                "                \"is_hidden\": false,\n" +
                "                \"slot\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"ability\": {\n" +
                "                    \"name\": \"chlorophyll\",\n" +
                "                    \"url\": \"https://pokeapi.co/api/v2/ability/34/\"\n" +
                "                },\n" +
                "                \"is_hidden\": true,\n" +
                "                \"slot\": 3\n" +
                "            }\n" +
                "        ],\n" +
                "        \"url_image_dream_worl\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/1.svg\",\n" +
                "        \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png\",\n" +
                "        \"hp\": 45,\n" +
                "        \"attack\": 49,\n" +
                "        \"defense\": 49,\n" +
                "        \"special_attack\": 65,\n" +
                "        \"special_defense\": 65,\n" +
                "        \"speed\": 45,\n" +
                "        \"chain\": [\n" +
                "            {\n" +
                "                \"name\": \"bulbasaur\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/1.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"ivysaur\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/2.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"venusaur\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/3.png\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"chain_group\": 1,\n" +
                "        \"national\": \"0001\"\n" +
                "    } ]";
        final ObjectMapper objectMapper = new ObjectMapper();
        this.pokemonOutDtos = objectMapper.readValue(groupsJson, new TypeReference<List<PokemonOutDto>>(){});
    }

    @Test
    public void getAllPokemons() {
        Mockito.when(pokemonBusiness.getAllPokemons(this.limit, this.offset)).thenReturn(this.pokemonOutDtos);
        assertNotNull(pokemonController.getAllPokemons(this.limit, this.offset));
    }

    @Test
    public void getAllPokemons200() {
        Mockito.when(pokemonBusiness.getAllPokemons(this.limit, this.offset)).thenReturn(null);
        ResponseEntity<Object> responseEntity = pokemonController.getAllPokemons(this.limit, this.offset);
        assertEquals(200, responseEntity.getStatusCodeValue());
    }



}
