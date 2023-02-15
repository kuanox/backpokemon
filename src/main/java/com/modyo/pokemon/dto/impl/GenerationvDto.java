package com.modyo.pokemon.dto.impl;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenerationvDto implements Serializable {

    private static final long serialVersionUID = 2520734602583993299L;
    @Name("black-white")
    private BlackWhiteDto black_white;

}
