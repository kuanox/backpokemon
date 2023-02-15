package com.modyo.pokemon.dto.impl;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class LanguageDto implements Serializable {

    private static final long serialVersionUID = -3198605897448318396L;
    private String name;
    private String url;

}
