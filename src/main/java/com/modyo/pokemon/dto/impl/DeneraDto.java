package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DeneraDto implements Serializable {

    private static final long serialVersionUID = 7767391501857553949L;
    private String genus;
    private LanguageDto language;

}
