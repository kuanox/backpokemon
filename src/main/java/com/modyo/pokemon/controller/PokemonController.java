package com.modyo.pokemon.controller;

import com.modyo.pokemon.business.IPokemonBusiness;
import com.modyo.pokemon.dto.impl.PokemonDto;
import com.modyo.pokemon.dto.out.PokemonOutDto;
import com.modyo.pokemon.exception.model.ErrorModel;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@CrossOrigin(origins = "*")
@Slf4j
@Tag(name = "Pokemon", description = "Pokemon controller")
public class PokemonController {

    @Autowired
    private IPokemonBusiness iPokemonBusiness;

    @GetMapping(path = "/pokedex/all", produces = "application/json")
    @Operation(summary = "Get Groups Pokemons for List")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description  = "Successful Operation", content = @Content(schema = @Schema(implementation = PokemonOutDto.class))),
            @ApiResponse(responseCode = "400", description  = "Bad Request/Invalid Arguments"),
            @ApiResponse(responseCode = "401", description = "Unauthenticated (invalid credentials, retry login). The request does not have valid authentication credentials for the operation."),
            @ApiResponse(responseCode = "404", description  = "Not found (Resource not found, invalid url, including invalid RPCs)", content = @Content(schema = @Schema(implementation = ErrorModel.class))),
            @ApiResponse(responseCode = "500", description  = "Internal errors. This means that some invariants expected by the underlying system have been broken. This error code is reserved for serious errors."),
    })
    public ResponseEntity<Object> getAllPokemons(@RequestParam String limit, @RequestParam String offset) {
        return new ResponseEntity<>(iPokemonBusiness.getAllPokemons(limit, offset), HttpStatus.OK);
    }

}
