package com.modyo.pokemon.dummy;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.modyo.pokemon.dto.PokemonBaseDto;
import com.modyo.pokemon.dto.impl.EvolutionChainDto;
import com.modyo.pokemon.dto.impl.PokemonDto;
import com.modyo.pokemon.dto.impl.PokemonSpeciesDto;
import com.modyo.pokemon.dto.out.PokemonOutDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Data {

    @Autowired
    protected ObjectMapper mapper;

    private List<PokemonBaseDto> pokemonBaseDtos;
    private List<PokemonDto> pokemonDto;
    private List<PokemonSpeciesDto> pokemonSpeciesDtos;
    private List<EvolutionChainDto> evolutionChainDtos;
    private List<PokemonOutDto> pokemonOutDtos;

    private Gson gson = new Gson();

    public List<PokemonOutDto> getPokemonOutDtos() {

        List<String> pokemonDto = new ArrayList<>();
        pokemonDto.add( " {\n" +
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
                        "    } ");

        pokemonDto.add("[ {\n" +
                "        \"id\": 2,\n" +
                "        \"name\": \"ivysaur\",\n" +
                "        \"type\": [\n" +
                "            \"grass\",\n" +
                "            \"poison\"\n" +
                "        ],\n" +
                "        \"species\": \"Seed Pokémon\",\n" +
                "        \"height\": 10,\n" +
                "        \"weight\": 130,\n" +
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
                "        \"url_image_dream_worl\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/2.svg\",\n" +
                "        \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/2.png\",\n" +
                "        \"hp\": 60,\n" +
                "        \"attack\": 62,\n" +
                "        \"defense\": 63,\n" +
                "        \"special_attack\": 80,\n" +
                "        \"special_defense\": 80,\n" +
                "        \"speed\": 60,\n" +
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
                "        \"national\": \"0002\"\n" +
                "    } ]");
        pokemonDto.add("[ {\n" +
                "        \"id\": 3,\n" +
                "        \"name\": \"venusaur\",\n" +
                "        \"type\": [\n" +
                "            \"grass\",\n" +
                "            \"poison\"\n" +
                "        ],\n" +
                "        \"species\": \"Seed Pokémon\",\n" +
                "        \"height\": 20,\n" +
                "        \"weight\": 1000,\n" +
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
                "        \"url_image_dream_worl\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/3.svg\",\n" +
                "        \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/3.png\",\n" +
                "        \"hp\": 80,\n" +
                "        \"attack\": 82,\n" +
                "        \"defense\": 83,\n" +
                "        \"special_attack\": 100,\n" +
                "        \"special_defense\": 100,\n" +
                "        \"speed\": 80,\n" +
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
                "        \"national\": \"0003\"\n" +
                "    } ]");
        pokemonDto.add("[ {\n" +
                "        \"id\": 4,\n" +
                "        \"name\": \"charmander\",\n" +
                "        \"type\": [\n" +
                "            \"fire\"\n" +
                "        ],\n" +
                "        \"species\": \"Lizard Pokémon\",\n" +
                "        \"height\": 6,\n" +
                "        \"weight\": 85,\n" +
                "        \"abilities\": [\n" +
                "            {\n" +
                "                \"ability\": {\n" +
                "                    \"name\": \"blaze\",\n" +
                "                    \"url\": \"https://pokeapi.co/api/v2/ability/66/\"\n" +
                "                },\n" +
                "                \"is_hidden\": false,\n" +
                "                \"slot\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"ability\": {\n" +
                "                    \"name\": \"solar-power\",\n" +
                "                    \"url\": \"https://pokeapi.co/api/v2/ability/94/\"\n" +
                "                },\n" +
                "                \"is_hidden\": true,\n" +
                "                \"slot\": 3\n" +
                "            }\n" +
                "        ],\n" +
                "        \"url_image_dream_worl\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/4.svg\",\n" +
                "        \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/4.png\",\n" +
                "        \"hp\": 39,\n" +
                "        \"attack\": 52,\n" +
                "        \"defense\": 43,\n" +
                "        \"special_attack\": 60,\n" +
                "        \"special_defense\": 50,\n" +
                "        \"speed\": 65,\n" +
                "        \"chain\": [\n" +
                "            {\n" +
                "                \"name\": \"charmander\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/4.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"charmeleon\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/5.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"charizard\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/6.png\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"chain_group\": 2,\n" +
                "        \"national\": \"0004\"\n" +
                "    } ]");

        pokemonDto.add("[  {\n" +
                "        \"id\": 5,\n" +
                "        \"name\": \"charmeleon\",\n" +
                "        \"type\": [\n" +
                "            \"fire\"\n" +
                "        ],\n" +
                "        \"species\": \"Flame Pokémon\",\n" +
                "        \"height\": 11,\n" +
                "        \"weight\": 190,\n" +
                "        \"abilities\": [\n" +
                "            {\n" +
                "                \"ability\": {\n" +
                "                    \"name\": \"blaze\",\n" +
                "                    \"url\": \"https://pokeapi.co/api/v2/ability/66/\"\n" +
                "                },\n" +
                "                \"is_hidden\": false,\n" +
                "                \"slot\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"ability\": {\n" +
                "                    \"name\": \"solar-power\",\n" +
                "                    \"url\": \"https://pokeapi.co/api/v2/ability/94/\"\n" +
                "                },\n" +
                "                \"is_hidden\": true,\n" +
                "                \"slot\": 3\n" +
                "            }\n" +
                "        ],\n" +
                "        \"url_image_dream_worl\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/5.svg\",\n" +
                "        \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/5.png\",\n" +
                "        \"hp\": 58,\n" +
                "        \"attack\": 64,\n" +
                "        \"defense\": 58,\n" +
                "        \"special_attack\": 80,\n" +
                "        \"special_defense\": 65,\n" +
                "        \"speed\": 80,\n" +
                "        \"chain\": [\n" +
                "            {\n" +
                "                \"name\": \"charmander\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/4.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"charmeleon\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/5.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"charizard\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/6.png\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"chain_group\": 2,\n" +
                "        \"national\": \"0005\"\n" +
                "    } ]");

        pokemonDto.add("[ {\n" +
                "        \"id\": 6,\n" +
                "        \"name\": \"charizard\",\n" +
                "        \"type\": [\n" +
                "            \"fire\",\n" +
                "            \"flying\"\n" +
                "        ],\n" +
                "        \"species\": \"Flame Pokémon\",\n" +
                "        \"height\": 17,\n" +
                "        \"weight\": 905,\n" +
                "        \"abilities\": [\n" +
                "            {\n" +
                "                \"ability\": {\n" +
                "                    \"name\": \"blaze\",\n" +
                "                    \"url\": \"https://pokeapi.co/api/v2/ability/66/\"\n" +
                "                },\n" +
                "                \"is_hidden\": false,\n" +
                "                \"slot\": 1\n" +
                "            },\n" +
                "            {\n" +
                "                \"ability\": {\n" +
                "                    \"name\": \"solar-power\",\n" +
                "                    \"url\": \"https://pokeapi.co/api/v2/ability/94/\"\n" +
                "                },\n" +
                "                \"is_hidden\": true,\n" +
                "                \"slot\": 3\n" +
                "            }\n" +
                "        ],\n" +
                "        \"url_image_dream_worl\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/6.svg\",\n" +
                "        \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/6.png\",\n" +
                "        \"hp\": 78,\n" +
                "        \"attack\": 84,\n" +
                "        \"defense\": 78,\n" +
                "        \"special_attack\": 109,\n" +
                "        \"special_defense\": 85,\n" +
                "        \"speed\": 100,\n" +
                "        \"chain\": [\n" +
                "            {\n" +
                "                \"name\": \"charmander\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/4.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"charmeleon\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/5.png\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"charizard\",\n" +
                "                \"url_image_home\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/home/6.png\"\n" +
                "            }\n" +
                "        ],\n" +
                "        \"chain_group\": 2,\n" +
                "        \"national\": \"0006\"\n" +
                "    } ]");

        List<PokemonOutDto> pokemonOutDto = new ArrayList<>();
        pokemonDto.stream().forEach(s -> {
            JsonArray groupJsonArray = gson.fromJson(s,JsonArray.class);
            PokemonOutDto pokemonOut = new PokemonOutDto();
            pokemonOut = mapper.convertValue(groupJsonArray, new TypeReference<PokemonOutDto>(){ });
            pokemonOutDto.add(pokemonOut);
        });
        //PokemonOutDto pokemonOutDto = new PokemonOutDto();
        //ArrayList dataPokemonOutList = new ArrayList();
        //dataPokemonOutList = (ArrayList) dataPokemonOut;
        //pokemonOutDto = (PokemonOutDto) mapper.convertValue(dataPokemonOutList, new TypeReference<List<PokemonOutDto>>(){ });
        return pokemonOutDto;
    }


    public PokemonBaseDto getPokemonBaseDto() throws JsonProcessingException {
        String groupsJson = "{\n" +
                "    \"count\": 1279,\n" +
                "    \"next\": \"https://pokeapi.co/api/v2/pokemon?offset=30&limit=30\",\n" +
                "    \"previous\": null,\n" +
                "    \"results\": [\n" +
                "        {\n" +
                "            \"name\": \"bulbasaur\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/1/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"ivysaur\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/2/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"venusaur\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/3/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"charmander\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/4/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"charmeleon\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/5/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"charizard\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/6/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"squirtle\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/7/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"wartortle\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/8/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"blastoise\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/9/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"caterpie\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/10/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"metapod\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/11/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"butterfree\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/12/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"weedle\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/13/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"kakuna\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/14/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"beedrill\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/15/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"pidgey\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/16/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"pidgeotto\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/17/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"pidgeot\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/18/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"rattata\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/19/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"raticate\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/20/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"spearow\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/21/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"fearow\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/22/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"ekans\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/23/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"arbok\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/24/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"pikachu\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/25/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"raichu\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/26/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"sandshrew\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/27/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"sandslash\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/28/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"nidoran-f\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/29/\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"name\": \"nidorina\",\n" +
                "            \"url\": \"https://pokeapi.co/api/v2/pokemon/30/\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";

        PokemonBaseDto pokemonBaseDto = new PokemonBaseDto();
        final ObjectMapper objectMapper = new ObjectMapper();
        pokemonBaseDto = objectMapper.readValue(groupsJson, new TypeReference<PokemonBaseDto>(){});
        return pokemonBaseDto;
    }




}
